package de.artesw.cv_restclient.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private LocalDate beginning;
    private LocalDate end;

    @ElementCollection
    @CollectionTable(name="skills", joinColumns=@JoinColumn(name="project_id"))
    @Column(name="skills")
    private List<String> skills;

    @ManyToOne
    @JoinColumn(name="cv_id")
    @JsonIgnore
    private Cv cv;


}
