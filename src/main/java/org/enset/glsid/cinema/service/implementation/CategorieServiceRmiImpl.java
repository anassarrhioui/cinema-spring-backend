package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Categorie;
import org.enset.glsid.cinema.repository.CategorieRepository;
import org.enset.glsid.cinema.service.rmi.CategorieServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;

@Service
@Transactional
public class CategorieServiceRmiImpl implements CategorieServiceRmi {

    private CategorieRepository categorieRepository;

    public CategorieServiceRmiImpl() {

    }

    @Autowired
    public CategorieServiceRmiImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public Categorie findById(Long id) throws RemoteException {
        return categorieRepository.findById(id).get();
    }

    @Override
    public List<Categorie> findAll() throws RemoteException {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie insert(Categorie object) throws RemoteException {
        return categorieRepository.save(object);
    }

    @Override
    public Categorie update(Categorie object) throws RemoteException {
        return categorieRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
        categorieRepository.deleteById(id);
    }
}
