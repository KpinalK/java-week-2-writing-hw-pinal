package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F - 32) x 5/9 = 0°C)
 */

public class Programme_7_TempConversion {

    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        // Object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertToDegreeCelsius(temp);

        // closing the scanner object
        scanner.close();
    }

    //Temperature conversion method
    public void convertToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }

}
