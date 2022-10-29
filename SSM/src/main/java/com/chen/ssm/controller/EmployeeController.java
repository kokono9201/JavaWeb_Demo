package com.chen.ssm.controller;
import com.chen.ssm.pojo.Employee;
import com.chen.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-29-18:03
 *
 * get all emp by page /employee/page/{page}-->get
 * jump to add page  /to/add
 * add emp /employee-->add
 * edit emp /employee-->put
 * delete emp by id /employee/{id}-->delete
 *
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum,Model model){
        //get the page No.
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //share the data to requesting field
        model.addAttribute("page", page);
        return "employee_list";
    }

    @RequestMapping(value = "/employee/page/1",method = RequestMethod.POST)
    public String addEmployee(Model model, Employee employee){
        employeeService.save(employee);
        PageInfo<Employee> page = employeeService.getEmployeePage(1);
        model.addAttribute("page", page);
        return "employee_list";
    }

    @RequestMapping(value="employee/{id}",method=RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    @RequestMapping(value="employee/page/1", method = RequestMethod.PUT)
    public String update(Model model, Employee employee){
        employeeService.update(employee);
        PageInfo<Employee> page = employeeService.getEmployeePage(1);
        model.addAttribute("page", page);
        return "employee_list";
    }

    @RequestMapping(value="employee/{id}", method = RequestMethod.DELETE)
    public String update(Model model, @PathVariable("id") Integer id){
        employeeService.delete(id);
        PageInfo<Employee> page = employeeService.getEmployeePage(1);
        model.addAttribute("page", page);
        return "employee_list";
    }

}
