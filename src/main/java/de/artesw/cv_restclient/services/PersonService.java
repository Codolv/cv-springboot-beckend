package de.artesw.cv_restclient.services;

import de.artesw.cv_restclient.model.Cv;
import de.artesw.cv_restclient.model.Person;
import de.artesw.cv_restclient.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    public Person save(Person person) {
        for(Cv cv: person.getCv()) {
            cv.setPerson(person);
        }
        return personRepository.save(person);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
