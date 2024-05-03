package org.example;

import org.example.entity.Building;
import org.example.entity.Castle;
import org.example.factory.CastleFactory;

public class Main {
    public static void main(String[] args) {

        Building castle = new CastleFactory().createBuilding(new Castle.CastleBuilder().style("s1").size(10).name("c1"));

    }
}