package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Commentary {
    private int commentary_id;
    private String commentaryDescription;
    private Recipe recipe;
}
