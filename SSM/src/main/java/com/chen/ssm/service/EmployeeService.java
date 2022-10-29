package com.chen.ssm.service;

import com.chen.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-29-18:18
 */
public interface EmployeeService {

    /**
     *
     * @return
     */
    List<Employee> getAllEmp();

    PageInfo<Employee> getEmployeePage(Integer pageNum);

    void save(Employee employee);

    Employee getEmpById(Integer id);

    void update(Employee employee);

    void delete(Integer id);
}
