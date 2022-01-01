package org.enset.glsid.cinema.service.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface GeneriqueServiceRmi <T> extends Remote {
    T findById(Long id)throws RemoteException;
    List<T> findAll() throws RemoteException;
    T insert(T object) throws RemoteException;
    T update(T object) throws RemoteException;
    void delete(Long id) throws RemoteException;
}
