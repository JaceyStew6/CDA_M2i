package org.example.factory;

import org.example.entity.AbstractBuildingBuilder;
import org.example.entity.Building;

public abstract class BuildingFactory {

    public abstract Building createBuilding(AbstractBuildingBuilder builder);


}
