package org.enset.glsid.cinema.service.implementation;

import org.enset.glsid.cinema.entity.Sceance;
import org.enset.glsid.cinema.repository.SceanceRepository;
import org.enset.glsid.cinema.service.rmi.SceanceServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.RemoteException;
import java.util.List;

@Transactional
@Service
public class SceanceServiceRmiImpl implements SceanceServiceRmi {

    private SceanceRepository sceanceRepository;

    @Autowired
    SceanceServiceRmiImpl(SceanceRepository sceanceRepository){
            this.sceanceRepository= sceanceRepository;
    }

    public SceanceServiceRmiImpl() {
    }

    @Override
    public Sceance findById(Long id) throws RemoteException {
        return sceanceRepository.getById(id);
    }

    @Override
    public List<Sceance> findAll() throws RemoteException {
        return sceanceRepository.findAll();
    }

    @Override
    public Sceance insert(Sceance object) throws RemoteException {
        return sceanceRepository.save(object);
    }

    @Override
    public Sceance update(Sceance object) throws RemoteException {
        return sceanceRepository.save(object);
    }

    @Override
    public void delete(Long id) throws RemoteException {
        sceanceRepository.deleteById(id);
    }

    @Override
    public List<Sceance> findAllByFilmContaining(String mc) throws RemoteException {
        return sceanceRepository.findAllByFilmTitreContaining(mc);
    }
}
