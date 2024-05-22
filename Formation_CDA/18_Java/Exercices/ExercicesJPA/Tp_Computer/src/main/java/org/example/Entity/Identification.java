package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Embeddable
public class Identification {

    //Avec méthode @Embeddable
/*    private String ipAddress;
    private String macAddress;*/

    //Avec méthode @OneToOne
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identification")
    private int id;

    private String ipAddress;
    private String macAddress;

    @OneToOne(mappedBy = "identification")
    private Computer computer;
}
