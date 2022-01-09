package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    List<Cinema> findCinemaByVille(Ville v);
}
