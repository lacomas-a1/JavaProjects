//Sum of Digits Using Recursion.

import java.util.*;

public class SumOfDigits {
    public static int sum_of_digit(int num){
        if(num==0)
            return 0;
        return(num% 10 +sum_of_digit(num/10));
        
    }
    public static void main(String[]args){
         //Take input from the user
        //Create an instance of the Scanner Class

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digits:");
        int num=sc.nextInt();
        int res=sum_of_digit(num);
        System.out.println("The Sum of digits is: " +res);
    }


}


// Algorithm:
// Start
// Create an instance of the Scanner class.
// Declare a variable to store the number.
// Ask the user to initialize the variable.
// Declare a user-defined function to calculate the sum of digits of the number using recursion.
// Call the function recursively to calculate the sum of digits.
// Display the sum of digits.
// Stop.