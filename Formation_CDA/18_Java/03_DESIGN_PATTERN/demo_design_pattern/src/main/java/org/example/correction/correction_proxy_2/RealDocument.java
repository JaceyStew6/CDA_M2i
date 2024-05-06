package org.example.correction.correction_proxy_2;

public class RealDocument implements Document {

    private final String name;

    public String getName() {
        return name;
    }

    public RealDocument(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println("Read document");
    }

    @Override
    public void edit() {
        System.out.println("Edit document");
    }
}
