package Descion_making_statements;

import java.util.Scanner;

public class ifstatements {
    private static Scanner sc;
    public static void main(String[]args){
        int Number;
        sc= new Scanner(System.in);
        System.out.println("Please Enter any integer Value:");
        Number = sc.nextInt();

        if(Number > 1){
            System.out.println("\n You have entered a POSITIVE Number");
        }
    }
}

// if statement allows the compiler to test the condition first and, depending upon the result, it will execute the block of code.
