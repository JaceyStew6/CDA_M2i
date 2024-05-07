package org.example.correction.correction_flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String, SharedVehiculeState> flyweights = new HashMap<>();

    public SharedVehiculeState getFlyWeight(String typeDeVehicule, String marque, String modele, String couleur) {
        String key = typeDeVehicule + "|" + marque + "|" + modele + "|" + couleur;
        if(!flyweights.containsKey(key)){
            flyweights.put(key, new SharedVehiculeState( marque,  modele,  couleur));
        }
        return flyweights.get(key);
    }


}
