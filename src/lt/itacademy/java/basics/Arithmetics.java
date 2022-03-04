package lt.itacademy.java.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetics {
    public static boolean isNumeric(String string) {
        int intValue;
        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static  int GetInput() {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("\nINPUT : ");
            var temp = read.nextLine();
            if (isNumeric(temp)) {
                var i = Integer.parseInt(temp);
                    return i;
            }
        } catch (InputMismatchException e) {
            System.out.println("Bad Input");
        }
        return 0;
    }
    public static double ToCm(double feet, double inch)
    {
     inch += feet*12;
     return inch*2.54;
    }

    public static void main(String[] args) {
        int number = GetInput();
        System.out.println("Area: "+Math.pow(number,3) + "CM3");
        System.out.println("Perimeter: "+number*12+" CM");
        double feet = 2.4;
        double inch = 4;
        System.out.println(feet+ " feet and "+ inch+" inches: "+ToCm(feet,inch) + "cm");
    }
}
