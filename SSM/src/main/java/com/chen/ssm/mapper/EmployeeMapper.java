package com.chen.ssm.mapper;

import com.chen.ssm.pojo.Employee;

import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-29-18:29
 */
public interface EmployeeMapper {

    List<Employee> getAllEmp();

    void save(Employee employee);

    Employee getEmpById(Integer id);

    void update(Employee employee);

    void delete(Integer id);
}
