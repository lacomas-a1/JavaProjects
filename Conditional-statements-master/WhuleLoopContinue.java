package Descion_making_statements;

import java.util.Scanner;

public class WhuleLoopContinue {
    private static Scanner sc;
    public static void main(String[]args){
        int Number;
        sc =new Scanner(System.in);
        System.out.println("Please Enter an Integer Value below 10:");
        Number =sc.nextInt();
        int i=0;
        while (i <=Number){
            if(i==4 || i==8){
                System.out.format("Skipped=%d\n",i);
                i++;
                continue;
            }
            System.out.format("Values=%d\n",i);
            i++;
        }
    }
}

// If this condition is True, the Java continue statement will be executed, and the iteration will stop at that number without printing the other: System.out.format(” Values = %d \n”, i);. For better understanding, we placed System.out.format(” Skipped = %d \n”, i); inside the If condition. So, whenever the iteration break, that value be printed from this message.
// If the condition is false, then it will skip the continue statement and prints that number as output (In Our case 0,1,2,3,4,6,7,8,10).
