package org.enset.glsid.cinema;

import org.enset.glsid.cinema.entity.*;
import org.enset.glsid.cinema.repository.CategorieRepository;
import org.enset.glsid.cinema.repository.CinemaRepository;
import org.enset.glsid.cinema.service.implementation.CategorieServiceRmiImpl;
import org.enset.glsid.cinema.service.rmi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: Anass Arrhioui
 */

@SpringBootApplication
public class CinemaBackendApplication implements CommandLineRunner {
    private CategorieServiceRmi categorieServiceRmi;
    private CinemaServiceRmi cinemaServiceRmi;
    private FilmServiceRmi filmServiceRmi;
    private SalleServiceRmi salleServiceRmi;
    private VilleServiceRmi villeServiceRmi;
    private TicketServiceRmi ticketServiceRmi;
    private  SceanceServiceRmi sceanceServiceRmi;

    @Autowired
    public CinemaBackendApplication(CategorieServiceRmi categorieServiceRmi, CinemaServiceRmi cinemaServiceRmi, FilmServiceRmi filmServiceRmi, SalleServiceRmi salleServiceRmi, VilleServiceRmi villeServiceRmi, TicketServiceRmi ticketServiceRmi, SceanceServiceRmi sceanceServiceRmi) {
        this.categorieServiceRmi = categorieServiceRmi;
        this.cinemaServiceRmi = cinemaServiceRmi;
        this.filmServiceRmi = filmServiceRmi;
        this.salleServiceRmi = salleServiceRmi;
        this.villeServiceRmi = villeServiceRmi;
        this.ticketServiceRmi = ticketServiceRmi;
        this.sceanceServiceRmi = sceanceServiceRmi;
    }

    public static void main(String[] args) {
        SpringApplication.run(CinemaBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        categorieServiceRmi.insert(Categorie.builder().nom("Test2").build());
        cinemaServiceRmi.insert(Cinema.builder().nom("Nom cine").nombreSalle(10).build());
        filmServiceRmi.insert(Film.builder().duree(123.0).dateSortie("2021-21-22").description("Hello world").photo("link").realisateur("Ana").build());
        salleServiceRmi.insert(Salle.builder().nom("Nom salle").nombrePlaces(20).build());
        villeServiceRmi.insert(Ville.builder().nom("Nador").build());
        sceanceServiceRmi.insert(Sceance.builder().prix(12.0f).dateSceance("12/21/2020").heureSceance("12:12").build());
        ticketServiceRmi.insert(Ticket.builder().nomClient("Anass Arrhioui").codePayement(12).reservee(true).build());

        categorieServiceRmi.findAll().forEach(System.out::println);
        cinemaServiceRmi.findAll().forEach(System.out::println);
        filmServiceRmi.findAll().forEach(System.out::println);
        salleServiceRmi.findAll().forEach(System.out::println);
        villeServiceRmi.findAll().forEach(System.out::println);
        sceanceServiceRmi.findAll().forEach(System.out::println);
        ticketServiceRmi.findAll().forEach(System.out::println);


    }
}
