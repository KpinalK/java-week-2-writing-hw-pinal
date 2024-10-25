package homework_week_6;

import java.util.Scanner;

/**
 * Write a java programme to enter any radius value of the circle and find out the area.(Formula of area A=PI*r*r).
 */

public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);

        //closing the scanner
        scanner.close();
    }

        //Calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circile is  : " + area);


    }
}
