import java.util.Scanner;

public class PerfectNumber2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num =sc.nextInt();
        if (checkPerfect(num)){
            System.out.print(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect Number");
        }
    }

    static boolean checkPerfect(int num){
        //To store sum of divisors
        int sum =1;

        //Find all divisors and add them
        for (int i=2; i*i<=num; i++){
            if (num % i == 0){
                if (i * i !=num)
                    sum =sum + i + num/i;
                else
                    sum=sum+i;
            }
        }
        // If sum of divisors is equal to number
        // Then number is a perfect number
        if (sum==num && num !=1)
        return true;
    return false;
    }
}
// Java Program to find the Perfect Number
// In this program, we will check whether the number is perfect or not using a for loop.

// Algorithm
// Start

// Create an instance of the Scanner class.

// Declare a variable.

// Ask the user to initialize the variable.

// Call a method to check whether the number is perfect or not.

// // Declare a variable to store the sum of divisors.

// // Initialize the sum to 1.

// // Use a for loop to find the divisors of the entered number.

// Update the sum each time a divisor of the entered number encounters.

// If the sum of all the divisors of the entered numbers is equal to the entered number, then print it as a perfect number.

// If the sum of all the divisors of the entered numbers is not equal to the entered number, then print it as not a perfect number.

// Display the result.

// Stop

// Below is the Java code to find the perfect number.


