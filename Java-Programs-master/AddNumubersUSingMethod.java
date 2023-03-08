import java.util.Scanner;

public class AddNumubersUSingMethod {
    private static Scanner sc;

    public static void main(String[]args){
        int Num1,Num2,Sum;
        sc=new Scanner(System.in);

        System.out.println("\n Enter Integer: ");
        Num1=sc.nextInt();

        //System.out.println("\n Enter Integer: ");
        Num2=sc.nextInt();

        Sum=add(Num1,Num2);
        System.out.println("\n Sum is: " + Sum);

    }
    public static int add(int Num1,int Num2){
        int sum;
        sum=Num1+Num2;
        return sum;
    }
}

// If you observe the following statement, we are calling the add method and assigning the return value to integer variable Sum

// Sum = add(Number1, Number2);
// Let us see the code inside the add method


// public static int add(int Number1,int Number2){
// 		int Sum;
// 		Sum = Number1 + Number2;
// 		return Sum;
// 	}
// From the above add two numbers in Java code snippet, you can observe that this method accepts two arguments of integer type.

// Within the function, we declared an integer variable Sum to store the added value.
// Next, we performed the arithmetic operation to add two integer numbers.
// Lastly, we are returning Sum


