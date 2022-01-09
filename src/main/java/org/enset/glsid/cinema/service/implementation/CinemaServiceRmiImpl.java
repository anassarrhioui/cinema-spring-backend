package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Cinema;
import org.enset.glsid.cinema.entity.Ville;
import org.enset.glsid.cinema.repository.CinemaRepository;
import org.enset.glsid.cinema.service.rmi.CinemaServiceRmi;
import org.enset.glsid.cinema.service.rmi.GeneriqueServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;
@Transactional
@Service
public class CinemaServiceRmiImpl implements CinemaServiceRmi {

    private CinemaRepository cinemaRepository;

    @Autowired
    public CinemaServiceRmiImpl(CinemaRepository cinemaRepository){
         this.cinemaRepository = cinemaRepository;
    }

    public CinemaServiceRmiImpl() {
    }

    @Override
    public Cinema findById(Long id) throws RemoteException {
        return cinemaRepository.getById(id);
    }

    @Override
    public List<Cinema> findAll() throws RemoteException {
        return cinemaRepository.findAll();
    }

    @Override
    public Cinema insert(Cinema object) throws RemoteException {
        return cinemaRepository.save(object);
    }

    @Override
    public Cinema update(Cinema object) throws RemoteException {
        return cinemaRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
         cinemaRepository.deleteById(id);
    }

    @Override
    public List<Cinema> findCinemaByVille(Ville v) {
        return cinemaRepository.findCinemaByVille(v);
    }
}
