package org.example.factory;

import org.example.entity.AbstractBuildingBuilder;
import org.example.entity.Building;

public class CastleFactory extends BuildingFactory{

    @Override
    public Building createBuilding(AbstractBuildingBuilder castleBuilder) {
        return castleBuilder.build();
    }

}
