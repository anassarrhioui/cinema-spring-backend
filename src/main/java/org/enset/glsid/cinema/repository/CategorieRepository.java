package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
    List<Categorie> findByNomContainingIgnoreCase(String nom);
}
