package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int event_id;
    private String eventName;

    @OneToOne
//    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

//    private LocalDateTime eventDateTime;

    private Date eventDate;
    private Time eventTime;

    private int sitCapacity;


}
