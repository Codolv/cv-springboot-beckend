package de.artesw.cv_restclient.controller;

import de.artesw.cv_restclient.model.Cv;
import de.artesw.cv_restclient.model.Project;
import de.artesw.cv_restclient.services.CvService;
import de.artesw.cv_restclient.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cv")
public class CvController {
    @Autowired
    private CvService service;

    @GetMapping
    public List<Cv> findAll() {
        return service.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Cv create(@RequestBody Cv cv) {
        return service.save(cv);
    }

    @GetMapping("/{id}")
    public Optional<Cv> findById(@PathVariable Long id) {
        return service.findById(id);
    }
}


