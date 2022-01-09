package org.enset.glsid.cinema.repository;

import org.enset.glsid.cinema.entity.Salle;
import org.enset.glsid.cinema.entity.Sceance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.RemoteException;
import java.util.List;

public interface SceanceRepository extends JpaRepository<Sceance, Long> {
    List<Sceance> findAllByFilmTitreContaining(String mc);
    List<Sceance> findSceanceBySalle(Salle salle) ;

}
