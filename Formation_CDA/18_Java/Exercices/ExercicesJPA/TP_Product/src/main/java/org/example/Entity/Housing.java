package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Builder
@Data
@AllArgsConstructor
public class Housing extends Product{
    private int height;
    private int width;

    public Housing() {
        super();
    }
}
