package com.priyanka.Employee.address.repo;

import com.priyanka.Employee.address.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
