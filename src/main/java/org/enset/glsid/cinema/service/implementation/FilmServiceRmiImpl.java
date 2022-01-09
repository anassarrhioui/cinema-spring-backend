package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Film;
import org.enset.glsid.cinema.repository.FilmRepository;
import org.enset.glsid.cinema.service.rmi.FilmServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;

@Transactional
@Service
public class FilmServiceRmiImpl implements FilmServiceRmi {


    private FilmRepository filmRepository;
    @Autowired
    public FilmServiceRmiImpl(FilmRepository filmRepository){
        this.filmRepository=filmRepository;
    }

    public FilmServiceRmiImpl() {
    }

    @Override
    public Film findById(Long id) throws RemoteException {
        return filmRepository.getById(id) ;
    }

    @Override
    public List<Film> findAll() throws RemoteException {
        return filmRepository.findAll();
    }

    @Override
    public Film insert(Film object) throws RemoteException {
        return filmRepository.save(object);
    }

    @Override
    public Film update(Film object) throws RemoteException {
        System.out.println(object);
        return filmRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
        filmRepository.deleteById(id);
    }

    @Override
    public List<Film> findAllByTitreContaining(String mc) throws RemoteException {
        return filmRepository.findAllByTitreContaining(mc);
    }
}
