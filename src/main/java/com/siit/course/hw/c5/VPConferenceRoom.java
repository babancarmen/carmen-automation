package com.siit.course.hw.c5;

import static com.siit.course.hw.c5.Appliance.VP;

public class VPConferenceRoom extends ConferenceRoom{

    public VPConferenceRoom(String name) {
        super(name);
        addAppliance(VP,1);
    }
}
