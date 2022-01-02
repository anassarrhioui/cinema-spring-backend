package org.enset.glsid.cinema.config;

import org.enset.glsid.cinema.service.rmi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import javax.annotation.PostConstruct;
import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@org.springframework.context.annotation.Configuration
public class Configuration {

    private List<GeneriqueServiceRmi<?>> rmiServices = new ArrayList<>(7);

    private CategorieServiceRmi categorieServiceRmi;
    private CinemaServiceRmi cinemaServiceRmi;
    private FilmServiceRmi filmServiceRmi;
    private SalleServiceRmi salleServiceRmi;
    private SceanceServiceRmi sceanceServiceRmi;
    private TicketServiceRmi ticketServiceRmi;
    private VilleServiceRmi villeServiceRmi;

    @Autowired
    public Configuration(CategorieServiceRmi categorieServiceRmi, CinemaServiceRmi cinemaServiceRmi, FilmServiceRmi filmServiceRmi, SalleServiceRmi salleServiceRmi, SceanceServiceRmi sceanceServiceRmi, TicketServiceRmi ticketServiceRmi, VilleServiceRmi villeServiceRmi) {
        this.categorieServiceRmi = categorieServiceRmi;
        this.cinemaServiceRmi = cinemaServiceRmi;
        this.filmServiceRmi = filmServiceRmi;
        this.salleServiceRmi = salleServiceRmi;
        this.sceanceServiceRmi = sceanceServiceRmi;
        this.ticketServiceRmi = ticketServiceRmi;
        this.villeServiceRmi = villeServiceRmi;
    }

    @PostConstruct
    private void addServicesRmiToList(){
        rmiServices.addAll(Arrays.asList(
                categorieServiceRmi,
                cinemaServiceRmi,
                filmServiceRmi,
                salleServiceRmi,
                sceanceServiceRmi,
                ticketServiceRmi,
                villeServiceRmi
        ));
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi1(CategorieServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("categorieServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi2(CinemaServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("cinemaServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi3(FilmServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("filmServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }
    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi4(SalleServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("salleServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi5(SceanceServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("sceanceServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi6(TicketServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("ticketServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi7(VilleServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("villeServiceRmi");
        exporter.setService(rmiService);
        return exporter;
    }
}
