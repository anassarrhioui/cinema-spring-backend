package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Long> {
    List<Salle> findSalleByCinema(Cinema cinema);
    List<Salle> findAllByNomContaining(String mc);

}
