package com.example.demo.persistance;

import com.example.demo.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressDAO extends CrudRepository<Address, Integer> {

    Address findByAid(int id);
}
