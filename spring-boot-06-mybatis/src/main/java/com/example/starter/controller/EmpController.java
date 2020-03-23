package com.example.starter.controller;

import com.example.starter.mapper.EmployeeMapper;
import com.example.starter.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/getEmp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("insEmp")
    public Employee insEmp(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }


}
