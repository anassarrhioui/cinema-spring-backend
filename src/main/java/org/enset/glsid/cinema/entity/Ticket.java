package org.enset.glsid.cinema.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nomClient;
    private Integer codePayement;
    private Boolean reservee ;

    @ManyToOne
    private Sceance sceance ;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", nombreClient='" + nomClient + '\'' +
                ", codePayement=" + codePayement +
                ", reservee=" + reservee +
                '}';
    }
}
