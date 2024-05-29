package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "picture")

public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pictureId;
    private String url;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
