package org.enset.glsid.cinema.config;

import org.enset.glsid.cinema.service.rmi.CategorieServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import java.beans.Introspector;


@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @Autowired
    public RmiServiceExporter getCategorieServiceRmi(CategorieServiceRmi rmiService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(1099);
        exporter.setServiceName("TEST");
        exporter.setService(rmiService);
        return exporter;
    }
}
