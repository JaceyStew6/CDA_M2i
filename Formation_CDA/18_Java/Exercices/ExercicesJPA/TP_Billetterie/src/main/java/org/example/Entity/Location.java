package org.example.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor

public class Location extends Address{

/*    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    private int location_id;*/
    private int capacity;

    @OneToOne(mappedBy = "location")
    private Event event;

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
