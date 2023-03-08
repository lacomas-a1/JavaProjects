// Perfect number, a positive integer that is equal to the sum of its proper divisors. 
import java.util.Scanner;

public class PerfectNumber1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Number:");
        int num2=sc.nextInt();
        System.out.println("Perfect Number Within Range Are:");

        for(int i=num1; i<=2; i++){
            if(checkPerfect(i))
            System.out.print(i+ " ");
        }

    }
    // check and print Whether perfect or not.
    static boolean checkPerfect(int num){
        // To store sum of divisors
        int sum= 0, i=1;
        while(i<num){
            if(num % i ==0){
                sum =sum + i;
            }
            i++;
        }
        if(sum == num)
           return true;

        return false;
    }
    
}


// Algorithm
// Start

// Create an instance of the Scanner class.

// Declare the range.

// Ask the user to initialize the range.

// Use a for loop to iterate over the elements within that range.

// Call a method to check whether the number is perfect or not.

// Declare a variable to store the sum of divisors and another loop variable.

// Initialize the sum to 0 and the loop variable to 1.

// Use a while loop to find the divisors of the entered number.

// Update the sum each time a divisor of the entered number encounters.

// Increment the loop variable after each iteration.

// If the sum of all the divisors of the entered numbers is equal to the entered number, then return true.

// If the sum of all the divisors of the entered numbers is not equal to the entered number, then return false.

// Display the perfect elements.

// Stop

// Below is the Java code to find the perfect number.

// Program 3: Java Program to find the Perfect Number
// In this program, we will find the perfect numbers within a range.

