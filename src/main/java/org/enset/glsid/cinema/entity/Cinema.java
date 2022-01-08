package org.enset.glsid.cinema.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Cinema implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private Integer nombreSalle ;

    @ManyToOne
    private Ville ville;

    @OneToMany(mappedBy = "cinema")
    private List<Salle> salles = new ArrayList<>();

    @Override
    public String toString() {
        return nom;
    }
}
