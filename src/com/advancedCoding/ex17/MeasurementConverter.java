package com.advancedCoding.ex17;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}
