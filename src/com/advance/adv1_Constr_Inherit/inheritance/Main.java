package com.advance.adv1_Constr_Inherit.inheritance;

/**Create a Shape class.
 - Add fields, create constructor, getters and setters.
 - Create classes Rectangle and Circle. Both of them should inherit class Shape.
 - Which fields and methods are common?
 */
public class Main {

    public static void main(String[] args) {

        Shape shape1 = new Circle(2);
        Shape shape2 = new Rectangle(2, 3);

        Shape[] shapes = new Shape[] {shape1, shape2};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }
}
