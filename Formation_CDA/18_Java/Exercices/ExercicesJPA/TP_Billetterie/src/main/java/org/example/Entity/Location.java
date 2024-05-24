package org.example.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor

public class Location extends Address{

    private int capacity;

    @Override
    public String toString() {
        return "Location{" +
                "capacity=" + capacity +
                ", address_id=" + address_id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
