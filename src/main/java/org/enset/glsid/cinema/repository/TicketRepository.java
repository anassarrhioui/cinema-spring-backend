package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
