import java.util.Scanner;
// perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128. 
public class PerfectNumber {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        checkPerfect(num);
    }
    // checks and print whether perfect or not
    static void checkPerfect(int num){
        //To store sum of divisors
        int sum = 0,i=1;
        while(i<num){
            if (num % i==0){
                sum =sum + i;
            }
            i++;
        }
        if (sum == num){
            System.out.println(" Perfect Number is: " +num);
        }
        else{
            System.out.println(" Not Perfect Number : " +num);
        }
    }
}

// Java Program to find the Perfect Number
// In this program, we will check whether the number is perfect or not using a while loop.

// Algorithm
// Start

// Create an instance of the Scanner class.

// Declare a variable.

// Ask the user to initialize the variable.

// Call a method to check whether the number is perfect or not.

// Declare a variable to store the sum of divisors and another loop variable.

// Initialize the sum to 0 and the loop variable to 1.

// Use a while loop to find the divisors of the entered number.

// Update the sum each time a divisor of the entered number encounters.

// Increment the loop variable after each iteration.

// If the sum of all the divisors of the entered numbers is equal to the entered number, then print it as a perfect number.

// If the sum of all the divisors of the entered numbers is not equal to the entered number, then print it as not a perfect number.

// Display the result.

// Stop

// Below is the Java code to find the perfect number.

// 