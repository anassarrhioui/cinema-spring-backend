package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Salle;

import java.rmi.RemoteException;
import java.util.List;

public interface SalleServiceRmi extends GeneriqueServiceRmi<Salle>{
    List<Salle> findBySalleByCinema(Cinema cinema) throws RemoteException;
    List<Salle> findAllByNomContaining(String mc)throws RemoteException;
}
