package com.atguigu.springboot04webrestfulcrud.controller;

import com.atguigu.springboot04webrestfulcrud.dao.DepartmentDao;
import com.atguigu.springboot04webrestfulcrud.dao.EmployeeDao;
import com.atguigu.springboot04webrestfulcrud.entities.Department;
import com.atguigu.springboot04webrestfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Controller
public class EmplyeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    //查询所有员工
    @GetMapping("/emps")
    public String list(Map<String,Object> map){
        Collection<Employee> employees=  employeeDao.getAll();
        //放在请求域中
        map.put("emps",employees);
        //thymeleaf默认拼接字符串
        //classpath:/templates/   .html
        return "list";
    }

    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Map<String,Object> model){
        Collection<Department> departments=departmentDao.getDepartments();
        model.put("depts",departments);
        //来到添加页面
        return "add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //保存员工
        employeeDao.save(employee);
        //来到员工列表页面
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee=employeeDao.get(id);
        model.addAttribute("emp",employee);
        model.addAttribute("depts",departmentDao.getDepartments());
        //回到修改页面（add是一个修改添加二合一）
        return "add";
    }

    //员工修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id")Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
