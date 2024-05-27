package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_id;

    private int sitNumber;
    private String sitType;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
