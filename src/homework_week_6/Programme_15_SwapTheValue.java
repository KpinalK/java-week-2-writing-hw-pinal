package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to swap two variables.
 *
 */

public class Programme_15_SwapTheValue {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapValue(first,second);
        //closing the scanner
        scanner.close();

    }

    //swapping the value of variables
    public void swapValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, the value of first variable is : " + a + " and second variable is :" + b);
    }
}
