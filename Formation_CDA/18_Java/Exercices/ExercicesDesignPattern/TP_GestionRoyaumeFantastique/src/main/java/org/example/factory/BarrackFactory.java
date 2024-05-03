package org.example.factory;

import org.example.entity.AbstractBuildingBuilder;
import org.example.entity.Building;

public class BarrackFactory extends BuildingFactory{

    @Override
    public Building createBuilding(AbstractBuildingBuilder barrackBuilder){
        return barrackBuilder.build();
    }

}
