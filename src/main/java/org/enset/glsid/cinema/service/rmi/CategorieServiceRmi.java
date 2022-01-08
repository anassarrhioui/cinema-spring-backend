package org.enset.glsid.cinema.service.rmi;

import org.enset.glsid.cinema.entity.Categorie;

import java.rmi.RemoteException;
import java.util.List;

public interface CategorieServiceRmi extends GeneriqueServiceRmi<Categorie>{
    List<Categorie> findAllByNomContaining(String nom) throws RemoteException;
}
