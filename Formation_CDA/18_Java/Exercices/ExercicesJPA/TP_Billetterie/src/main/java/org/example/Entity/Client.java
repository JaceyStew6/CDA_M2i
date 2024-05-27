package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int client_id;
    private String lastname;
    private String firstname;

    private int clientAge;
    private String phoneNumber;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address")
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Ticket> tickets ;

}
