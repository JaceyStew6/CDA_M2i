package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Step {
    private int step_id;
    private String stepDescription;
    private Recipe recipe;
}
