package de.artesw.cv_restclient.services;

import de.artesw.cv_restclient.model.Cv;
import de.artesw.cv_restclient.model.Project;
import de.artesw.cv_restclient.repository.CvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CvService {
    @Autowired
    private CvRepository repository;

    public List<Cv> findAll() {
        return repository.findAll();
    }

    public Optional<Cv> findById(Long id) {
        return repository.findById(id);
    }

    public Cv save(Cv cv) {
        for (Project p : cv.getProjects()) {
            p.setCv(cv);
        }
        return repository.save(cv);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
