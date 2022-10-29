package com.chen.ssm.service.impl;

import com.chen.ssm.mapper.EmployeeMapper;
import com.chen.ssm.pojo.Employee;
import com.chen.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-29-18:19
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmp() {

        return employeeMapper.getAllEmp();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //use pageHelper before get data
        PageHelper.startPage(pageNum, 4);
        //get all employee
        List<Employee> list = employeeMapper.getAllEmp();
        //get page info
        PageInfo<Employee> page = new PageInfo<Employee>(list,5);
        return page;
    }

    @Override
    public void save(Employee employee) {
        employeeMapper.save(employee);
    }

    @Override
    public Employee getEmpById(Integer id) {
       return employeeMapper.getEmpById(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public void delete(Integer id) {
        employeeMapper.delete(id);
    }
}
