package org.enset.glsid.cinema;

import org.enset.glsid.cinema.entity.Categorie;
import org.enset.glsid.cinema.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Anass Arrhioui
 */

@SpringBootApplication
public class CinemaBackendApplication implements CommandLineRunner {
    @Autowired
    private CategorieRepository categorieRepository;

    public static void main(String[] args) {
        SpringApplication.run(CinemaBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        categorieRepository.save(Categorie
                .builder()
                .nom("Test1")
                .build());
        categorieRepository.save(Categorie
                .builder()
                .nom("Test2")
                .build());
        categorieRepository.findAll().forEach(System.out::println);
    }
}
