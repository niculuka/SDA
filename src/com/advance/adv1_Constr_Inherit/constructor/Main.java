package com.advance.adv1_Constr_Inherit.constructor;
/**Create class Dog.
    a) Add private fields to the class, like name, age, gender, race, weight.
    b) Create constructor that accepts all of the class fields.
    c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
    d) Create getters and setters for age and weight.
    e) Create object of class Dog. Verify if everything works as expected.
    f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
 */
public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Kevin", 1,"male", "labrador", 10);
        Dog dog2 = new Dog("famale", "labrador");
        System.out.println(dog1);
        System.out.println(dog2);

        dog1.setAge(2);
        dog1.setWeight(15);
        System.out.println(dog1);
        System.out.println(dog2);

        dog2.setAge(-1);
        dog2.setWeight(-20);

        System.out.println(dog1);
        System.out.println(dog2);

    }
}
