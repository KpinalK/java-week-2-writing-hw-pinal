package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert upper case to lower case.
 */
public class Programme_9_ConvertUpperToLow {

    public static void main(String[] args) {
        // declare scanner for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string :");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLow t = new Programme_9_ConvertUpperToLow();
        t.convertUppercaseToLowercase(uppercase);
        //closing the scanner object
        scanner.close();

    }

    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowercase(String text){
        System.out.println("The Lowercase value is =  " + text.toLowerCase());
    }
}
