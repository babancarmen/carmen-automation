package com.siit.course.hw.c5;

public class Kitchen extends Room{

    public Kitchen(String name) {
        super(name);

        addAppliance(Appliance.COFFE_MACHINE,1);
        addAppliance(Appliance.WATER_DISPENCER,1);
        addAppliance(Appliance.FRIDGE,1);
    }
}
