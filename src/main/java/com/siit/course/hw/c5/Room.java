package com.siit.course.hw.c5;

import java.util.HashMap;
import java.util.Map;

public abstract class Room {

    private Map<Furniture, Integer> furnitureItmes;
    private Map<Appliance, Integer> appliances;
    private String name;

    public Room(String name) {
        this.name = name;
        furnitureItmes = new HashMap<>();
        appliances = new HashMap<>();
    }

    public void addFurniture(Furniture furniture, int pieces){
        furnitureItmes.put(furniture, pieces);
    }

    public void addAppliance(Appliance appliance, int pieces){
        appliances.put(appliance, pieces);
    }

    @Override
    public String toString() {
        return name + " has furniture: " + furnitureItmes + ", appliances " + appliances;
    }
}
