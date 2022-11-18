package com.siit.course.hw.c5;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private final List<Floor> floors = new ArrayList<>();

    public void addFloor(Floor floor){
        floors.add(floor);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Building has " + floors.size() + " floors\n");
        int idx=1;
        for(Floor floor:floors){
            s.append("Floor ").append(idx++).append(":\n").append(floor.toString());
        }
        return s.toString();
    }
}
