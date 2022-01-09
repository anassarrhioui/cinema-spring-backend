package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Ville;

import java.rmi.RemoteException;
import java.util.List;

public interface CinemaServiceRmi extends GeneriqueServiceRmi<Cinema>{
   public  List<Cinema> findCinemaByVille(Ville v) throws RemoteException;

}

