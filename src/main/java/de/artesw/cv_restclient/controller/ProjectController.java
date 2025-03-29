package de.artesw.cv_restclient.controller;

import de.artesw.cv_restclient.model.Project;
import de.artesw.cv_restclient.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService service;

    @GetMapping
    public List<Project> findAll() {
        return service.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Project create(@RequestBody Project project) {
        return service.save(project);
    }
}


