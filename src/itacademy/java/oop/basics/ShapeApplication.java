//Task 3
//        • Create a package, name: com.itacademy.java.oop.basics
//        • Create two classes: Square and ShapeApplication.
//        • Square has fields: length and width of Double type
//        • ShapeApplication has: main method.
//        • Create Square objects (more than one) in ShapeApplication and fill out all fields with data. Store shapes in an array.
//        • Iterate through the array of the shapes and check if shape is valid (values are not negative) if any of the value is negative print them out. For valid shapes calculate area and perimeter and print it out.
//
//        Requirements:
//        • Use constructors (with-args, without-args).
//       • Use encapsulation.
//        • Calculation must be done using methods.
//        •	• To print out all information create the method

package itacademy.java.oop.basics;

import java.util.ArrayList;

public class ShapeApplication {
    public static void main(String[] args) {
    ArrayList<Square> list = new ArrayList<Square>();
    list.add(new Square());
    list.add(new Square(5,5));
    list.add(new Square(-5,0));
    list.add(new Square(-5,5));
    list.add(new Square(100,0));
        for (Square square : list) {
            if (square.getLength() < 1 || square.getWidth() < 1) {
                System.out.println("The Object created had an Error! ");
                System.out.println(square.toString());
            } else {
                System.out.println("Shape " + square.getId() + " Area is : " + square.getArea() + " and Perimeter is : " + square.getPerimeter());
            }
        }
    }
}
