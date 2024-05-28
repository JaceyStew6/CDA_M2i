package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Location extends Address{

    @Id
    @GeneratedValue
    private int id;

    private int capacity;

    @Override
    public String toString() {
        return "Location{" +
                "capacity=" + capacity +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
