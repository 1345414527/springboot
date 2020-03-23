package com.example.starter.mapper;

import com.example.starter.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //可以使用MapperScan注解
public interface EmployeeMapper {
    public Employee getEmpById(@Param("id") int id);

    public void insertEmp(Employee emp);
}
