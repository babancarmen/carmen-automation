package com.siit.course.hw.c5;

public class MainHw5 {

    public static void main(String[] args) {

        Building building = new Building();

        building.addFloor(buildFloorOne());
        building.addFloor(buildFloorTwo());
        building.addFloor(buildFloorThree());

        System.out.println(building);
    }

    private static Floor buildFloorThree() {
        Floor floor = new Floor();

        Room toilet1 = new Toilet("Toilet 1");
        Room toilet2 = new Toilet("Toilet 2");

        Room conferenceRoom1 = new VPConferenceRoom("Conference room 1");
        conferenceRoom1.addFurniture(Furniture.SEAT, 30);
        conferenceRoom1.addAppliance(Appliance.TELEPRESENCE, 1);

        Room conferenceRoom2 = new TVConferenceRoom("Conference room 2");
        conferenceRoom2.addFurniture(Furniture.SEAT, 20);
        conferenceRoom2.addAppliance(Appliance.TELEPRESENCE, 1);

        Room conferenceRoom3 = new TVConferenceRoom("Conference room 3");
        conferenceRoom3.addFurniture(Furniture.SEAT, 10);
        conferenceRoom3.addAppliance(Appliance.TELEPRESENCE, 1);

        Room conferenceRoom4 = new TVConferenceRoom("Conference room 4");
        conferenceRoom4.addFurniture(Furniture.SEAT, 10);
        conferenceRoom4.addAppliance(Appliance.TELEPRESENCE, 1);

        Room conferenceRoom5 = new TVConferenceRoom("Conference room 5");
        conferenceRoom5.addFurniture(Furniture.SEAT, 10);
        conferenceRoom5.addAppliance(Appliance.TELEPRESENCE, 1);

        Room conferenceRoom6 = new TVConferenceRoom("Conference room 6");
        conferenceRoom6.addFurniture(Furniture.SEAT, 10);
        conferenceRoom6.addAppliance(Appliance.TELEPRESENCE, 1);

        floor.addRooms(toilet1, toilet2);
        floor.addRooms(conferenceRoom1, conferenceRoom2, conferenceRoom3, conferenceRoom4, conferenceRoom5, conferenceRoom6);

        return floor;
    }

    private static Floor buildFloorTwo() {
        Floor floor = new Floor();

        Room officeSpace1 = new OfficeSpace("Office space 1");
        officeSpace1.addFurniture(Furniture.DESK, 10);

        Room officeSpace2 = new OfficeSpace("Office space 2");
        officeSpace2.addFurniture(Furniture.DESK, 10);

        Room toilet1 = new Toilet("Toilet 1");
        Room toilet2 = new Toilet("Toilet 2");

        Room kitchen = new Kitchen("Kitchen");

        Room conferenceRoom1 = new TVConferenceRoom("Conference room 1");
        conferenceRoom1.addFurniture(Furniture.SEAT, 8);

        Room conferenceRoom2 = new TVConferenceRoom("Conference room 2");
        conferenceRoom2.addFurniture(Furniture.SEAT, 8);

        Room conferenceRoom3 = new TVConferenceRoom("Conference room 3");
        conferenceRoom3.addFurniture(Furniture.SEAT, 8);

        Room conferenceRoom4 = new TVConferenceRoom("Conference room 4");
        conferenceRoom4.addFurniture(Furniture.SEAT, 8);

        floor.addRooms(officeSpace1, officeSpace2);
        floor.addRooms(toilet1, toilet2);
        floor.addRooms(kitchen);
        floor.addRooms(conferenceRoom1, conferenceRoom2, conferenceRoom3, conferenceRoom4);

        return floor;
    }

    private static Floor buildFloorOne() {
        Floor floor = new Floor();

        Room officeSpace = new OfficeSpace("Office space");
        officeSpace.addFurniture(Furniture.DESK, 20);

        Room toilet1 = new Toilet("Toilet 1");
        Room toilet2 = new Toilet("Toilet 2");

        Room kitchen = new Kitchen("Kitchen");

        Room conferenceRoom1 = new TVConferenceRoom("Conference room 1");
        conferenceRoom1.addFurniture(Furniture.SEAT, 10);

        Room conferenceRoom2 = new TVConferenceRoom("Conference room 2");
        conferenceRoom2.addFurniture(Furniture.SEAT, 10);

        Room conferenceRoom3 = new TVConferenceRoom("Conference room 3");
        conferenceRoom3.addFurniture(Furniture.SEAT, 10);

        floor.addRooms(officeSpace, toilet1, toilet2, kitchen, conferenceRoom1, conferenceRoom2, conferenceRoom3);

        return floor;
    }
}
