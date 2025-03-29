package de.artesw.cv_restclient.repository;

import de.artesw.cv_restclient.model.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Long> {
}
