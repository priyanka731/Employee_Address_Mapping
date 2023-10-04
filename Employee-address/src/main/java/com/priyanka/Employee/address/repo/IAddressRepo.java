package com.priyanka.Employee.address.repo;

import com.priyanka.Employee.address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {

}
