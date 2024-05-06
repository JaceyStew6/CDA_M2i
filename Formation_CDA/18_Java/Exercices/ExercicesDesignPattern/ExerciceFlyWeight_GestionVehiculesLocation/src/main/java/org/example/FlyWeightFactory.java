package org.example;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private Map<String, SharedVehiculeState> flyweights = new HashMap<>();

    public SharedVehiculeState getFlyweight(int id, String model, String color){
        int key = id;
        if(!flyweights.containsKey(key)){
            flyweights.put(String.valueOf(key), new SharedVehiculeState(model, color));
        }
        return flyweights.get(key);
    }
}
