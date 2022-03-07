package lt.itacademy.java.basics;

import java.util.ArrayList;
import java.util.Collections;

public class Operations {
    public static void main(String[] args) {

        //System.out.println(CheckTriangel(3,3,3));
        System.out.println(CheckCar(100, 6, 7, 1.25));
        System.out.println(CheckCar(110, 25, 7, 1.25));
    }

    public static String CheckTriangel(Integer a, Integer b, Integer c) {
        ArrayList<Integer> sides = new ArrayList<Integer>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        Collections.sort(sides);
        if (sides.size() == 3 && Math.pow(sides.get(0), 2) + Math.pow(sides.get(1), 2) != Math.pow(sides.get(2), 2)) {
            return "Triangle is invalid.";
        }
        if (sides.size() == 1) {
            return "Triangle is Equilateral.";
        } else if (sides.size() == 2) {
            return "Triangle is Isosceles";
        } else
            return "Triangle is Scalene";

    }

    public static String CheckCar(float dest, float Cur_fuel, float usage, double price) {
        float temp_dest = (float) Math.ceil(dest / 100);
        float KmPerLitle = usage / 100;
        float LitreForTrip = dest * KmPerLitle;
        if (Cur_fuel * KmPerLitle * 100 < dest)
            return "Destination is in " + dest + "km. " + "Car is not able to reach the destination.It needs " + (LitreForTrip - Cur_fuel) + " liters of fuel more. It will cost " + price * (LitreForTrip - Cur_fuel);
        else {
            return "Destination is in " + dest + "km. " + "Car Will reach the destination. And will have " + (Cur_fuel - LitreForTrip) + " liters of fuel more.";

        }
    }
}
