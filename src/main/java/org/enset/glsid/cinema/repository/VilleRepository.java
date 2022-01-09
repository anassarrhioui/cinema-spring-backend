package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VilleRepository extends JpaRepository<Ville, Long> {
    List<Ville> findAllByNomContaining(String mc);
}
