package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

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

    //Avec méthode @Embedded
/*    @Embedded
    private Identification identification;*/



    //Avec méthode @OneToOne
    @OneToOne
    @JoinColumn(name = "id_identification")
    private Identification identification;

    @ManyToOne
    @JoinColumn(name = "id_processor")
    private Processor processor;

    @OneToMany
    @JoinColumn(name = "id")
    private List<OperatingSystem> operatingSystems;

    public void add(OperatingSystem operatingSystem){
        operatingSystems.add(operatingSystem);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", computerName='" + computerName + '\'' +
                ", price=" + price +
                ", identification=" + identification +
                ", processor=" + processor +
                ", operatingSystems=" + operatingSystems +
                '}';
    }
}
