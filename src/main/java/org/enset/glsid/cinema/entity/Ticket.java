package org.enset.glsid.cinema.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nombreClient;
    private double prix ;
    private int codePayement;
    private boolean reservee ;

    @ManyToOne
    private Sceance sceance ;
}
