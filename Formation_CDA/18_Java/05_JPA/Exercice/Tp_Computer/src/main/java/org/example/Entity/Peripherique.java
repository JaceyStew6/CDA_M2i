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
public class Peripherique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peripherique_id")
    private int id;
    private  int nbrPorts;
    private String name;

    @ManyToMany (cascade = CascadeType.REMOVE)
    @JoinTable(name = "periph_computer",joinColumns = @JoinColumn(name = "peripherique_id"),inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Computer> computers;


    public void add (Computer computer){
        computers.add(computer);
    }
}
