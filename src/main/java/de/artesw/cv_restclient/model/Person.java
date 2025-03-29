package de.artesw.cv_restclient.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String abschluss;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "person")
    private Cv cv;
}
