package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Ticket;
import org.enset.glsid.cinema.repository.TicketRepository;
import org.enset.glsid.cinema.service.rmi.TicketServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;

@Service
@Transactional
public class TicketServiceRmiImpl implements TicketServiceRmi {

    private TicketRepository ticketRepository;

    @Autowired
    public TicketServiceRmiImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public TicketServiceRmiImpl() {
    }

    @Override
    public Ticket findById(Long id) throws RemoteException {
        return ticketRepository.getById(id);
    }

    @Override
    public List<Ticket> findAll() throws RemoteException {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket insert(Ticket object) throws RemoteException {
        return ticketRepository.save(object);
    }

    @Override
    public Ticket update(Ticket object) throws RemoteException {
        return ticketRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
        ticketRepository.deleteById(id);
    }
}
