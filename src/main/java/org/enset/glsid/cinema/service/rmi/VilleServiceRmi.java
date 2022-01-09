package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Ville;

import java.rmi.RemoteException;
import java.util.List;

public interface VilleServiceRmi extends GeneriqueServiceRmi<Ville>{
    List<Ville> findAllByNomContaining(String mc) throws RemoteException;
}
