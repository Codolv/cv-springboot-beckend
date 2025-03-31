package de.artesw.cv_restclient.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.PERSIST)
    private List<Project> projects;

    @ManyToOne
    @JoinColumn(name="person_id")
    @JsonIgnore
    private Person person;
}
