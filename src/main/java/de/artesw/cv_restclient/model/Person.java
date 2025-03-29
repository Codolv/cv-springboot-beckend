package de.artesw.cv_restclient.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String firstname;
    private String lastname;
    private String description;
    private Contact contact;
}
