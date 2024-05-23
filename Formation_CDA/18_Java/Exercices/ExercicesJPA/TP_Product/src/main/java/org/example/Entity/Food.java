package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Builder
@Data
@AllArgsConstructor

public class Food extends Product{

    private Date expirationDate;

    public Food(){
        super();
    }
}
