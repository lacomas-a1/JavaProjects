package Loop;

import java.util.Scanner;

public class ForLoop {
    private static Scanner sc;

    public static void main(String[]args){
        int i, Number, Sum=1;
        sc=new Scanner(System.in);

        System.out.println("\n please Enter Integer VAlue:");
        Number=sc.nextInt();

        for (i=1; i<=Number; i++){
            Sum =Sum*i;
        }
        System.out.format("Sum of the Numbers is:%d",Sum);
    }
}


//In this Java for loop program, the following statements will ask the user to enter any integer value below 10. Next, we are assigning the user entered value to the integer variable (number)
//
//        System.out.println("\n Please Enter the any integer Value: ");
//        number = sc.nextInt();
//        Next line, we used the For loop, and the Condition inside it will make sure that the value of i is less than or equal to user-specified Number.
//
//        for (i = 1; i <= number; i++)  {
//        sum = sum * i;
//        }
//        In this Java for loop example, User Entered value: Number = 5 and we initialized the sum = 0
//
//
//        First Iteration
//
//        Within the For Loop statements, we initialized the i value as 1. Remember, Initialization happens only once. Next, the compiler will check for the condition (i <= number), which is TRUE. So, the statement or block of code inside it will execute.
//
//        sum = sum * i
//        sum = 1 * 1 ==> 1
//
//        Next, i value will incremented by 1 (i++). Please refer to Increment and Decrement Operators in Java article to understand this ++ notation.
//
//        Second Iteration
//
//
//        Within the first Iteration, the values of i changed as i = 2. Next, Javac will evaluates the condition (i <= number), which is TRUE. So, the statement inside it will execute.
//
//        sum = sum * i
//
//        sum = 1 * 2 ==> 2
//
//
//        Next, the number will increment by 1 (number ++).
//
//        Third Iteration
//
//        Within the second Iteration, the values of both i and sum changed as i = 3 and sum = 2. Next, the Javac compiler will check for the condition (i <= number), which is TRUE.
//
//
//        sum = sum * i
//
//        sum = 2 * 3 ==> 6
//
//        Fourth Iteration
//
//        Within the third Iteration, the values of i = 4 and sum = 6. Next, Javac will check for the condition (i <= number), which is TRUE. So, the statement inside it will execute.
//
//        sum = sum * i
//
//        sum = 6 * 4 ==> 24
//
//        Fifth Iteration
//
//        Within the fourth Iteration of this for loop java, the values of i = 5 and sum = 24.
//
//        sum = sum * i
//
//        sum = 24 * 5 ==> 120
//
//        I = 6. So, the condition present in the code ( 6 <= 5) evaluates to false.
//
//        Last System.out.format statement will print the number of digits present in the given number as output.
//
//        System.out.format(" Sum of the Numbers From the For Loop is: %d ", sum);
