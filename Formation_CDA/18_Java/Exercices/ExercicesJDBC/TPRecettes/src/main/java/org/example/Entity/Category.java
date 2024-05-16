package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Category {
    private int category_id;
    private String categoryName;

    @Override
    public String   toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
