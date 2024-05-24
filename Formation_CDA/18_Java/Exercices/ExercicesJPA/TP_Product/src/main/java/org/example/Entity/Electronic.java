package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Builder
@Data
@AllArgsConstructor
public class Electronic extends Product{
    private String batteryDuration;

    public Electronic(){
        super();
    }
}
