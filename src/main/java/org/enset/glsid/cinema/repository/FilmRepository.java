package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
