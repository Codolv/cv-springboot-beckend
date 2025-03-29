package de.artesw.cv_restclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.artesw.cv_restclient.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
