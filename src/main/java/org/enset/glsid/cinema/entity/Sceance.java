package org.enset.glsid.cinema.entity;

import lombok.*;

import javax.persistence.*;
import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
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

    @Override
    public String toString() {
        return "Sceance{" +
                "id=" + id +
                ", dateSceance='" + dateSceance + '\'' +
                ", prix=" + prix +
                ", heureSceance='" + heureSceance + '\'' +
                '}';
    }
}
