package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Film;

import java.rmi.RemoteException;
import java.util.List;

public interface FilmServiceRmi extends GeneriqueServiceRmi<Film>{
    List<Film> findAllByTitreContaining(String mc) throws RemoteException;
}


