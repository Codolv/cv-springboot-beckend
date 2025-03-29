package de.artesw.cv_restclient.controller;

import de.artesw.cv_restclient.model.Person;
import de.artesw.cv_restclient.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }

    // create a person
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.save(person);
    }
}
