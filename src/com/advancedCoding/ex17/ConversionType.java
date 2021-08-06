package com.advancedCoding.ex17;

public enum ConversionType {
    METERS_TO_YARDS(new MetersToYardsConverter()),
    YARDS_TO_METERS(yards -> yards * 0.914),
    CENTIMETERS_TO_INCHES(centimeter -> centimeter * 2.5),
    INCHES_TO_CENTIMETERS(inch -> inch * 0.3),
    KILOMETERS_TO_MILES(kilometer -> kilometer * 1.6),
    MILES_TO_KILOMETERS(mile -> mile * 0.7);

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}
