package org.enset.glsid.cinema.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private Double duree;
    private String realisateur;
    private String description ;
    private String photo ;
    @Column(length = 20)
    private String dateSortie;

    @ManyToOne
    Categorie categorie ;

    @OneToMany(mappedBy = "film")
    private List<Sceance> sceances = new ArrayList<>();

    @Override
    public String toString() {
        return titre;
    }
}
