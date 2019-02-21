package com.grk.controller;

import com.grk.entity.Employee;
import com.grk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("getAll")
    public String getAll(Model model){
        List<Employee> list = employeeService.getAll();
        model.addAttribute("list",list);
        return "forward:/emplist.jsp";
    }

    @RequestMapping("addEmployee")
    public String addEmployee(Employee employee){
        employeeService.insertEmployee(employee);
        return "redirect:/employee/getAll";
    }

    @RequestMapping("removeEmployee")
    public String removeEmployee(Integer id){
        employeeService.removeEmployee(id);
        return "redirect:/employee/getAll";
    }

    @RequestMapping("getEmployeeInfo")
    public String getEmployeeInfo(Integer id,Model model){
        model.addAttribute("e", employeeService.showEmployeeById(id));
        return "forward:/updateEmp.jsp";
    }

    @RequestMapping("updateEmployee")
    public String updateEmployee(Employee employee){
        employeeService.updateEmploye(employee);
        return "redirect:/employee/getAll";
    }
}
