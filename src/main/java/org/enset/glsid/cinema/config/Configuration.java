package org.enset.glsid.cinema.config;

import org.enset.glsid.cinema.service.rmi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import java.beans.Introspector;


@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi1(CategorieServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(CategorieServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi2(CinemaServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(CinemaServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi3(FilmServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(FilmServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }
    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi4(SalleServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(SalleServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi5(SceanceServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(SceanceServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi6(TicketServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(TicketServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi7(VilleServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName(Introspector.decapitalize(VilleServiceRmi.class.getName()));
        exporter.setService(rmiService);
        return exporter;
    }
}
