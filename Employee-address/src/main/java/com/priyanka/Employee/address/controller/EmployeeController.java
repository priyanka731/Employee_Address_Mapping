package com.priyanka.Employee.address.controller;

import com.priyanka.Employee.address.entity.Employee;
import com.priyanka.Employee.address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("employees") //get all employees
    public Iterable<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }

    @GetMapping("employeewithid")//get emp by id
    public Employee getEmployeebyid(@RequestParam("id") Long employeeId)
    {
        return employeeService.getEmployeebyid(employeeId);
    }
    @PostMapping("employees")//add new emp
    public String addEmp(@RequestBody Employee newEmployee)
    {
        return employeeService.saveEmployee(newEmployee);
    }
    @PutMapping("employee")//update emp id
    public String updateEmployee(@RequestParam("id") Long employeeId)
    {
        return employeeService.UpdateEmployee(employeeId);
    }


    @DeleteMapping("employee")
    public String DeleteEmployee(@RequestParam("id") Long employeeId)
    {
        return employeeService.DeleteEmployee(employeeId);
    }

}
