package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SSD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Important de préciser la stratégie pour éviter qu'il vienne créer de nouvelles tables non désirées
    private int id;

    private String brand;
    private int size;
    private String ssdType;


}
