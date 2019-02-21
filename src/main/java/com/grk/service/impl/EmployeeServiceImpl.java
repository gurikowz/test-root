package com.grk.service.impl;

import com.grk.dao.EmployeeMapper;
import com.grk.entity.Employee;
import com.grk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAll() {

        List<Employee> list = employeeMapper.selectAll();

        return list;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeMapper.insert(employee);

    }

    @Override
    public void removeEmployee(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Employee showEmployeeById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);

    }

    @Override
    public void updateEmploye(Employee employee) {

        employeeMapper.updateByPrimaryKey(employee);
    }
}
