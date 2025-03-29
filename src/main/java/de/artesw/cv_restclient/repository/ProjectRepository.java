package de.artesw.cv_restclient.repository;

import de.artesw.cv_restclient.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
