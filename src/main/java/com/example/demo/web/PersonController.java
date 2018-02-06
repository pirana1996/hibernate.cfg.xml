package com.example.demo.web;

import com.example.demo.model.Person;
import com.example.demo.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "api/person", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping(value = "all", method = GET)
    Iterable<Person> getAllProduct(){
        return this.personService.getAll();
    }

    @RequestMapping(method = GET)
    Person getPerson(@RequestParam int id){
        return this.personService.getPerson(id);
    }

}