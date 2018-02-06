package com.example.demo.web;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.service.impl.AddressService;
import com.example.demo.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "api/address", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @RequestMapping(value = "all", method = GET)
    Iterable<Address> getAllProduct(){
        return this.addressService.getAll();
    }

    @RequestMapping(method = GET)
    Address getAddress(@RequestParam int id){
        return this.addressService.getAddress(id);
    }

}
