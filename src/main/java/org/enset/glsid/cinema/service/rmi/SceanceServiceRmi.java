package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Sceance;

import java.rmi.RemoteException;
import java.util.List;

public interface SceanceServiceRmi extends GeneriqueServiceRmi<Sceance>{
    List<Sceance> findAllByFilmContaining(String mc) throws RemoteException;
}
