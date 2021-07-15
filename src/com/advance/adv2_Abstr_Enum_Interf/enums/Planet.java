package com.advance.adv2_Abstr_Enum_Interf.enums;

public enum Planet {
    MERCURY("huge planet", "Mercury", 1000000L),
    VENUS("love planet", "Venus", 2000000L),
    EARTH("life planet", "Earth", 0L),
    JUPITER("gas planet", "Jupiter", 15543212L),
    URANUS("metan planet", "Uranus", 1233545L),
    PLUTO("small planet", "Pluto", 15654653L),
    URANUS2("small planet", "Pluto", 15654653L);

    private String size;
    private String name;
    private Long distanceFromEarth;

    Planet(String size, String name, Long distanceFromEarth) {
        this.size = size;
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
    }

    public Long getDistanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return name + size;
    }
}
