package com.grk.service;

import com.grk.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    void insertEmployee(Employee employee);
    void removeEmployee(Integer id);
    Employee showEmployeeById(Integer id);

    void updateEmploye(Employee employee);

}
