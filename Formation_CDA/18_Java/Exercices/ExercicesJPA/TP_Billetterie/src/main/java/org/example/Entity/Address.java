package org.example.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Address {
    @Id
    @GeneratedValue
    protected int address_id;
    protected String street;
    protected String city;
}
