package com.example.demo.service.impl;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.persistance.AddressDAO;
import com.example.demo.persistance.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    AddressDAO addressDAO;
    @Autowired
    public AddressService(AddressDAO addressDAO){
        this.addressDAO = addressDAO;
    }
    public Address getAddress(int id){
        return addressDAO.findByAid(id);
    }
    public Iterable<Address> getAll(){
        return addressDAO.findAll();
    }
}
