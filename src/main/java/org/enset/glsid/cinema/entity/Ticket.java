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
    private Integer nombreClient;
    private Double prix ;
    private Integer codePayement;
    private Boolean reservee ;

    @ManyToOne
    private Sceance sceance ;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", nombreClient='" + nombreClient + '\'' +
                ", prix=" + prix +
                ", codePayement=" + codePayement +
                ", reservee=" + reservee +
                '}';
    }
}
