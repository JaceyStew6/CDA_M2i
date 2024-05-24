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
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String computerName;
    private float price;

//    @Embedded
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_identification")
    private Identification identification;

    @ManyToOne
    @JoinColumn(name = "id_processor")
    private Processor processor;

    @ManyToOne
    @JoinColumn(name = "os_id")
    private OS os;

    @ManyToMany(mappedBy = "computers")
    private List<Peripheral> peripherals;

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + computerName + '\'' +
                ", price=" + price +
                ", identifiant=" + identification +
                ", processor=" + processor +
                '}';
    }
}
