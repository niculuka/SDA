package com.advancedCoding.ex17;

/**
 * Create a ConversionType enum class with the constants:METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_INCHES,
 * INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
 * Enum should have a ConverterType parameter used to perform calculations for a given type.
 * Then create a MeasurementConverter class that will have the convert(int value, ConversionType conversionType) method,
 * and based on the value and type of conversion,
 * used the Converter of the given type and returned the result.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(MeasurementConverter.convert(45.67, ConversionType.CENTIMETERS_TO_INCHES));
    }
}
