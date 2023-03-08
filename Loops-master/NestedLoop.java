package Loop;

import java.util.Scanner;

public class NestedLoop {
    private static Scanner sc;
    public  static void main(String[]args){
        int i,j;
        sc =new Scanner(System.in);

        System.out.println("Please Enter Integer Below 10:");
        i=sc.nextInt();

        for(;i<=10;i++){
            for(j=1;j<=10;j++){
                System.out.format("%d * %d=%d\n",i,j, i*j);
            }
            System.out.println();
        }
    }
}

//Step 1: First, the compiler will check for the condition inside the first for loop.
//
//        If the condition is True, then statements inside the For loop will be executed. It means the compiler will enter into second For loop: Goto, Step 2.
//        If the condition is False, then the compiler will exit from For Loop.
//        Step 2: Java compiler will check for the condition inside the second for loop or nested for loop.
//
//        If the condition is True, statements inside the second For loop will execute. It means, it will execute from Statement 1 to N.
//        If the condition is False, the compiler will exit from second For Loop.
//        Step 3: Once it exits from second for loop, the compiler will check for the condition inside the for loop (repeating Step 1 ).

// Nested for loop Java program allows the user to enter any integer values. Then it will print the Multiplication table from the user-specified number to 10. To do this, we are going to nest one for loop inside another for loop. This also called nested for loop in java programming.

//    This Java Nested For Loop program prints the multiplication table for 9 and 10.
//
//        First For Loop First Iteration
//
//        In the first for loop, i initialized to value 9, and then it will check whether i is less than or equal to 10. This condition is True so, it will enter into second for loop.
//
//
//        Second For Loop First Iteration
//
//        It is the Nested For loop in Java. In the second for loop j is initialized to value 1. Next, it will check whether j is less than or equal to 10. This condition is True so, the Javac compiler will execute the statements inside the second for loop.
//
//        i * j ==> 9 * 1 = 9
//
//
//        Next, j value will increment by 1 (j++). Please refer to Increment and Decrement Operators in Java article to understand this ++ notation.
//
//        Second For Loop Second Iteration
//
//        Here, j is incremented by 1. So, J =2. Compiler will check whether j is less than or equal to 10. This condition is True so that the compiler will execute the statements inside the second for loop.
//
//
//        i * j ==> 9 * 2 = 18
//
//        Next, j value will increment by 1 (j++).
//
//        This process will repeat until j reaches to 11. Once the condition inside the second for loop fails, the compiler will exit from second for loop, and i will increment by 1 (i++). Next,
//
//
//        First For Loop Second Iteration
//
//        Here, i is incremented by 1 so, i =10. Compiler will check whether i is less than or equal to 10. This condition is True so, compiler will enter into second for loop
//
//        Second For Loop First Iteration
//
//
//        In the second for loop, j initialized to value 1, and then it will check whether j is less than or equal to 10. This condition is True. So, the compiler will execute the statements inside the second for loop.
//
//        i * j ==> 10 * 1 = 10
//
//        Next, j value will increment by 1 (j++).
//
//
//        Second For Loop Second Iteration – nested for loop in java
//
//        Here, j is incremented by 1, so J =2. Compiler will check whether j is less than or equal to 10. This condition is True so that the compiler will execute the statements inside the second for loop.
//
//        i * j ==> 10 * 2 = 20
//
//        Next, j value will incremented by 1 (j++).
//
//        This process will repeat until j reaches to 11. Once the condition inside the second for loop fails, the compiler will exit from second for loop, and i will increment by 1 (i++). Next,
//
//        First For Loop Third Iteration:
//
//        Here, i = 11, and the condition is False. For loop is terminated, No need to check the second loop, i.e., nested for loop in java.