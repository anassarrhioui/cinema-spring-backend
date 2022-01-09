package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findAllByTitreContaining(String mc);
}
