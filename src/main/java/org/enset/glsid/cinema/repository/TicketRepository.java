package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Salle;
import org.enset.glsid.cinema.entity.Sceance;
import org.enset.glsid.cinema.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findAllByNomClientContaining(String string);
}
