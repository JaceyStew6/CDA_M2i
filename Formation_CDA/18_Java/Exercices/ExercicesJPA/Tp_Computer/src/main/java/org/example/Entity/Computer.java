package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

import javax.persistence.*;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String computerName;
    private float price;

    //Avec méthode @Embedded
/*    @Embedded
    private Identification identification;*/



    //    //Avec méthode @OneToOne
    @OneToOne
    @JoinColumn(name = "id_identification")
    private Identification identification;
}
