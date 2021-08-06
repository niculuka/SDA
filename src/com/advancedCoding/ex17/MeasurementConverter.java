package com.advancedCoding.ex17;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType) {
        System.out.println(conversionType);
        return conversionType.getConverter().convert(value);
    }
}
