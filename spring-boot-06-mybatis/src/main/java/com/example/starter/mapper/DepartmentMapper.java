package com.example.starter.mapper;

import com.example.starter.pojo.Department;
import org.apache.ibatis.annotations.*;

@Mapper //可以使用MapperScan注解
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(@Param("id") int id);

    @Delete("delete from department where id=#{id}")
    public int delDeptById(@Param("id") int id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
