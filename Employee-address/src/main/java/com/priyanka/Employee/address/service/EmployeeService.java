package com.priyanka.Employee.address.service;

import com.priyanka.Employee.address.entity.Employee;
import com.priyanka.Employee.address.repo.IAddressRepo;
import com.priyanka.Employee.address.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Employee> getEmployees() {
        return employeeRepo.findAll();
    }
    public Employee getEmployeebyid(Long employeeId) {
        Optional<Employee> optional= employeeRepo.findById(employeeId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
    public String saveEmployee(Employee newEmployee) {
        employeeRepo.save(newEmployee);
        return "Employee saved successfully";
    }
    public String UpdateEmployee(Long employeeId) {
        if(employeeRepo.existsById(employeeId)){
            Employee employee = getEmployeebyid(employeeId);
            employeeRepo.save(employee);
            return "Employee id Updated";
        }
        else{
            return "employee  Id does not exist";
        }
    }
    public String DeleteEmployee(Long employeeId) {
        if(employeeRepo.existsById(employeeId)){
            employeeRepo.deleteById(employeeId);
            return "Employee Deleted";
        }
        else{
            return "Employee Id does not exist";
        }
    }
}