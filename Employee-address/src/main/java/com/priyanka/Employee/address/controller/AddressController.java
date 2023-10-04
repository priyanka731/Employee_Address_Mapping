package com.priyanka.Employee.address.controller;

import com.priyanka.Employee.address.entity.Address;
import com.priyanka.Employee.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public Iterable<Address> getAllAddress() {
        return addressService.getAllAddress();
    }
    @GetMapping("addresswithid")
    public Address getAddressbyid(@RequestParam("id") Long addressId)
    {
        return addressService.getAddressbyid(addressId);
    }
    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }
    @PutMapping("address")
    public String UpdateAddress (@RequestParam("id") Long addressId, @RequestParam("street") String addressStreet)
    {
        return addressService.UpdateAddress (addressId,addressStreet);
    }
    @DeleteMapping("address")
    public String DeleteAddress(@RequestParam("id") Long addressId)
    {
        return addressService.DeleteAddress(addressId);
    }
}

