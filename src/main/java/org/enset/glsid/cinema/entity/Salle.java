package org.enset.glsid.cinema.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Salle implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Integer nombrePlaces;

    @OneToMany(mappedBy = "salle")
    private List<Sceance> sceances = new ArrayList<>();

    @ManyToOne
    private Cinema cinema;

    @Override
    public String toString() {
        return nom;
    }
}
