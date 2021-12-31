package org.enset.glsid.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sceance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dateSceance;
    private Float prix;
    private String heureSceance;

    @OneToMany(mappedBy = "sceance")
    private List<Ticket> tickets = new ArrayList<>();

    @ManyToOne
    private Salle salle;

    @ManyToOne
    private Film film;

}
