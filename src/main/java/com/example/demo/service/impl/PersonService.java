package com.example.demo.service.impl;

import com.example.demo.model.Person;
import com.example.demo.persistance.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    PersonDAO personDAO;

    @Autowired
    public PersonService(PersonDAO personDAO){
        this.personDAO = personDAO;
    }
    public Person getPerson(int id){
        return personDAO.findByPid(id);
    }
    public Iterable<Person> getAll(){
        return personDAO.findAll();
    }
}
