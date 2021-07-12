package com.advance.adv2_abstr_enum_interf.enums;

/** Create enum Planets.
    - Override toString method. It should print relative size of a planet and it's name.
    E.g. „Huge Jupiter", „Small Pluto".
    - Create distanceFromEarth method.
    - Verify both methods for multiple planets.
 */

public class Main {
    public static void main(String[] args) {

        for (Planet planet : Planet.values()) {
            System.out.println(planet);
            System.out.println(planet.name());
            System.out.println(planet.getDistanceFromEarth());
        }

        Planet planetX = Planet.valueOf("URANUS2");
        switch (planetX) {
            case EARTH :
                System.out.println("This is Earth");
                break;
            case JUPITER:
            case PLUTO:
            case VENUS:
            case URANUS:
            case MERCURY:
                System.out.println("This is another planet");
                break;
            default:
                System.out.println("This is not handled");
        }

    }
}
