package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Event {

    @Id
    @GeneratedValue
    @Column (name = "id_event")
    private int id;

    private String name;

    private Date dateAndHours;

    @OneToOne
    @JoinColumn(name = "id_location")
    private Location location;

    private int numberOfPlace;

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

}
