
package Descion_making_statements;

import java.util.Scanner;

public class Ifelsestatement {
    private static Scanner sc;
    public static void main(String[]args){
        int Age;
        sc=new Scanner(System.in);
        System.out.println("Please Enter your Age:");
        Age= sc.nextInt();

        if(Age >= 18){
            System.out.println("You are eligible to Vote.");
            System.out.println("Please carry Your Voters ID to Polling booth");
        }
        else{
            System.out.println("You are NOT eligible to Vote.");
            System.out.println("We are Sorry for that");
        }
        System.out.println("This Message is coming from Outside the IF ELSE statement");
    }
}

// If the test_condition in the above syntax is true, True statements will run. Furthermore, if the test_condition result is false, the False statements will perform.
