package com.siit.course.hw.c5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Floor {

    private final List<Room> rooms = new ArrayList<>();

    public void addRooms(Room ... room){
        rooms.addAll(Arrays.asList(room));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Room room:rooms){
            s.append("\t").append(room.toString()).append("\n");
        }
        return s.toString();
    }
}
