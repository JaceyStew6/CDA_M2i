package org.example.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Identification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identification")
    private int identification_id;
    private String macAddress;
    private String ipAddress;

    @OneToOne(mappedBy = "identification", fetch = FetchType.LAZY)
    private Computer computer;

    @Override
    public String toString() {
        return "Identification{" +
                "id=" + identification_id +
                ", macAddress='" + macAddress + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
