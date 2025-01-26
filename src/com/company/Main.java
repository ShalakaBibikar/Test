
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Addition operation");

        int num1 = 5;
        int num2 = 6;
        int num3 = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int num1 = sc.nextInt();
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        System.out.println("Enter 2nd number :");
        int num2 = sc.nextInt();
        boolean b2 = sc.hasNextInt();
        System.out.println(b2);
//
        System.out.println("Enter 3rd number :");
        int num3 = sc.nextInt();
        boolean b3 = sc.hasNextInt();
        System.out.println(b3);
        int sum = num1 + num2 + num3 ;
        System.out.print("Sum of 3 numbers = ");
        System.out.println(sum);

    }
}