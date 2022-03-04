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
