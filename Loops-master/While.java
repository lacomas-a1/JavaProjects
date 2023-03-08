package Loops;

import java.util.Scanner;

public class While {
    private static Scanner sc;
    public static void main(String[]args){
        int Number, Sum =0;
        sc =new Scanner(System.in);

        System.out.println("\n Please Enter an Integer of Value below 10:");
        Number=sc.nextInt();

        while(Number <= 10){
            Sum =Sum + Number;
            Number++;
        }
        System.out.format("Sum of the Numbers from the while loop is: %d",Sum);

    }
}

// sum = sum + number

// sum = 0 + 7 ==> 7

// Next, number will be incremented by 1 (number ++). Refer Increment & Decrement Operators article in Java to understand this ++ notation.

// Second Iteration

// Within the first Iteration, both Number and sum changed as Number = 8 and sum = 7

// sum = 7 + 8 = 15

// Third Iteration

// From the Second Iteration, Number = 9 and sum = 15

// sum = 15 + 9 ==> 24

// Fourth Iteration: Within the third Iteration of the Java while loop, the values of both Number and sum changed as Number = 10 and sum = 24

// sum = 24 + 10 ==> 34

// Next, the number will increment by 1

// Here Number = 11. So, the condition present will fail

// Last System.out.format statement will print the number of digits present in the given number as output.
