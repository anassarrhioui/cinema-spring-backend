package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Ville;
import org.enset.glsid.cinema.repository.VilleRepository;
import org.enset.glsid.cinema.service.rmi.VilleServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;

@Service
@Transactional
public class VilleServiceRmiImpl implements VilleServiceRmi {
    private VilleRepository villeRepository;

    @Autowired
    public VilleServiceRmiImpl(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    public VilleServiceRmiImpl() {
    }

    @Override
    public Ville findById(Long id) throws RemoteException {
        return villeRepository.getById(id);
    }

    @Override
    public List<Ville> findAll() throws RemoteException {
        return villeRepository.findAll();
    }

    @Override
    public Ville insert(Ville object) throws RemoteException {
        return villeRepository.save(object);
    }

    @Override
    public Ville update(Ville object) throws RemoteException {
        return villeRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
        villeRepository.deleteById(id);
    }

    @Override
    public List<Ville> findAllByNomContaining(String mc) throws RemoteException {
        return villeRepository.findAllByNomContaining(mc);
    }
}
