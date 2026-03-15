package com.cfs.JPAP01.service;

import com.cfs.JPAP01.entity.Employee;
import com.cfs.JPAP01.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee saveEmployee(Employee employee) {

        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id="+id));
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee=employeeRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id="+id));
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());

        return employeeRepo.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee existingEmployee=employeeRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id="+id));

        employeeRepo.delete(existingEmployee);

    }
}
