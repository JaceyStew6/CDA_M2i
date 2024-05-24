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
public class Peripheral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_peripheral")
    private int peripheral_id;

    @ManyToMany
    @JoinTable(name = "computer_peripheral", joinColumns = @JoinColumn(name = "id_peripheral"), inverseJoinColumns = @JoinColumn(name = "peripheral_id"))
    private List<Computer> computers;

    public void add (Computer computer){
        computers.add(computer);
    }
}
