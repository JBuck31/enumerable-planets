package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, "rocky"),
    VENUS("Venus", 225, "rocky"),
    EARTH("Earth", 365, "rocky"),
    MARS("Mars", 687, "rocky"),
    JUPITER("Jupiter", 4333, "gas giant"),
    SATURN("Saturn", 10759, "gas giant"),
    URANUS("Uranus", 30687, "ice giant"),
    NEPTUNE("Neptune", 60200, "ice giant");

    private final String name;

    private final int yearLength;

    private final String type;

    Planets(String name, int yearLength, String type) {
        this.name = name;
        this.yearLength = yearLength;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getType() {
        return type;
    }
}


