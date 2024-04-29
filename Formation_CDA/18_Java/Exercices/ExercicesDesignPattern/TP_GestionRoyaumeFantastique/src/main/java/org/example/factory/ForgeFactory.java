package org.example.factory;

import org.example.entity.AbstractBuildingBuilder;
import org.example.entity.Building;

public class ForgeFactory extends BuildingFactory{

    @Override
    public Building createBuilding(AbstractBuildingBuilder forgeBuilder){
        return forgeBuilder.build();
    }

}
