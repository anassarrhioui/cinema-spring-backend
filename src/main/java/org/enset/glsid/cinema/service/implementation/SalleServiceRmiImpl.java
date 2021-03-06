package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Salle;
import org.enset.glsid.cinema.repository.SalleRepository;
import org.enset.glsid.cinema.service.rmi.GeneriqueServiceRmi;
import org.enset.glsid.cinema.service.rmi.SalleServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;
@Transactional
@Service
public class SalleServiceRmiImpl implements SalleServiceRmi {

    private SalleRepository salleRepository;

    @Autowired
    public SalleServiceRmiImpl(SalleRepository salleRepository){
        this.salleRepository = salleRepository ;
    }

    public SalleServiceRmiImpl() {
    }

    @Override
    public Salle findById(Long id) throws RemoteException {
        return salleRepository.getById(id);
    }

    @Override
    public List<Salle> findAll() throws RemoteException {
        System.out.println("All");
        return salleRepository.findAll();
    }

    @Override
    public Salle insert(Salle object) throws RemoteException {
        return salleRepository.save(object);
    }

    @Override
    public Salle update(Salle object) throws RemoteException {
        return salleRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
        salleRepository.deleteById(id);
    }

    @Override
    public List<Salle> findBySalleByCinema(Cinema cinema) throws RemoteException{
        return salleRepository.findSalleByCinema(cinema);
    }

    @Override
    public List<Salle> findAllByNomContaining(String mc) throws RemoteException {
        return salleRepository.findAllByNomContaining(mc);
    }
}
