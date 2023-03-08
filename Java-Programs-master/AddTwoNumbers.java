import java.util.Scanner;

public class AddTwoNumbers {
    private static Scanner sc;

    public static void main(String[]args){
        int Num1,Num2,Sum;
        sc=new Scanner(System.in);

        System.out.println("\n Enter Interger 1: ");
        Num1=sc.nextInt();

        System.out.println("\n Enter Interger 2: ");
        Num2=sc.nextInt();

        Sum=Num1 + Num2;
        System.out.println("Sum is: " + Sum);
        

    }
}

// Within this Java Program to Add Two Numbers, we used Arithmetic Operators + to add Number1 and Number2 and then assigned that total to Sum.

// Sum = Number1 + Number2;
// The following Java System.out.println statement will print the sum variable as output (10 + 25 = 35).

// System.out.println("\n Sum of the two integer values is = " + Sum);