package com.example.demo.persistance;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDAO extends CrudRepository<Person, Integer>{
    Person findByPid(int id);
}
