package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme_14_AreaAndPerimeter {

    public static void main(String[] args) {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of rectangle: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height of rectangle: ");
        int height = scanner.nextInt();
        areaAndPerimeterOfRectangle(height,width);
        //closing the scanner object
        scanner.close();

    }

    //Calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(int height, int width){
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of the rectangle is : " +area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }
}
