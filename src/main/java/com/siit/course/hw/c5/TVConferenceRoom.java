package com.siit.course.hw.c5;

import static com.siit.course.hw.c5.Appliance.TV;

public class TVConferenceRoom extends ConferenceRoom{

    public TVConferenceRoom(String name) {
        super(name);
        addAppliance(TV,1);
    }
}
