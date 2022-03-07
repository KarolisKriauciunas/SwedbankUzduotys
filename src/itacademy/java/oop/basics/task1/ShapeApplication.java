package itacademy.java.oop.basics.task1;
//Task 1
//        •	Create a package, name: com.itacademy.java.oop.basics.task1
//        •	Create class ShapeApplication with main method.
//        •	Create abstract class Shape with abstract methods calculateArea(), calculatePerimeter().
//        •	Create class Square with field side of double type.
//        •	Create class Circle with field radius of double type.
//        •	Circle and Square must extend Shape and implement its methods.
//        Requirements:
//        •	Create object for Circle and Square.
//        •	Use implemented methods to calculate area and perimeter for both objects.
//       •	Print out response implementing toString()

public class ShapeApplication {
    public static void main(String[] args) {
        Shape square1 = new Square(5);
        Shape circle1 = new Circle(2.4);
        System.out.println(square1);
        System.out.println(circle1);
    }
}
