package com.cfs.JPAP01.service;

import com.cfs.JPAP01.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id,Employee employee);
    void deleteEmployee(Integer id);
}
