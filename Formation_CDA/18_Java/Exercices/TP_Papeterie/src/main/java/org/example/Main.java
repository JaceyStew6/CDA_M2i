package org.example;

import org.example.model.Item;
import org.example.model.PaperReam;
import org.example.model.Pen;

public class Main {
    public static void main(String[] args) {


        Item pen1 = new Pen("Stylo bille", 2, "Bleu");
        Item pen2 = new Pen("Stylo plume", 10, "Rouge");
        Item paperReam1 = new PaperReam("Ramette 90g", 4, 90);


        System.out.println(pen1);
        System.out.println(pen2);
        System.out.println(paperReam1);


    }
}