package com.advancedCoding.ex8;

/**
 *  Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
 *  Create a Parcel class with the parameters:
 *      • int xLength
 *      • int yLength
 *      • int zLength
 *      • float weight
 *      • boolean isExpress
 *  The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
 *  not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
 *  In case of errors, it should inform the user about them.
 */

public class Main {
    public static void main(String[] args) {
        Validator<Parcel> parcelValidator = new ParcelValidator();
        Parcel parcel1 = new Parcel(35, 35, 35, 10, true);
        Parcel parcel2 = new Parcel(100,100,100,25,false);
        Parcel parcel3 = new Parcel(100,100,10,25,false);
        Parcel parcel4 = new Parcel(100, 40, 100, 20, true);

        parcelValidator.validate(parcel1);
        System.out.println("===========================");

        parcelValidator.validate(parcel2);
        System.out.println("===========================");

        parcelValidator.validate(parcel3);
        System.out.println("===========================");

        parcelValidator.validate(parcel4);
        System.out.println("===========================");
    }
}
