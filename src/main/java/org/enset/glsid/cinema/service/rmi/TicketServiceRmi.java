package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Salle;
import org.enset.glsid.cinema.entity.Sceance;
import org.enset.glsid.cinema.entity.Ticket;

import java.rmi.RemoteException;
import java.util.List;

public interface TicketServiceRmi extends GeneriqueServiceRmi<Ticket>{
    List<Ticket> findAllByNomClientContaining(String string) throws RemoteException;
}
