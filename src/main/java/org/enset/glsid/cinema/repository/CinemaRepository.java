package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
