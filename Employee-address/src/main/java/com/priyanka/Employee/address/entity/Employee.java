package com.priyanka.Employee.address.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empFirstName;
    private String empLastName;
    private String empContact;

    @OneToOne
    @JoinColumn(name ="fk_addressId")
    Address address;
}