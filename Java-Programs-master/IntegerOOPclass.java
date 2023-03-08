import java.util.Scanner;

public class IntegerOOPclass {
    //Calling AddIntegerUsingOOPs.
    private static Scanner sc;

    public static void main(String[]args){
        int Num1,Num2,Sum;
        sc=new Scanner(System.in);

        System.out.println("\n Enter Integer: ");
        Num1=sc.nextInt();
        System.out.println("\n Enter Integer: ");
        Num2=sc.nextInt();

        AddIntegerUsingOOps addNum=new AddIntegerUsingOOps();
        addNum.x=Num1;
        addNum.y=Num2;

        addNum.add();
        Sum=addNum.addAgain(Num1,Num2);
        System.out.println("\n Sum is: " + Sum);
    }
}


// Add Two Numbers in Java AddNumbers Class Analysis:


// First, we declared a function add with zero arguments. Within the function, we performed the arithmetic addition and printing the Output using System.out.println statement.
// Next, we declared an integer function addAgain with two arguments. Within the function, we performed the arithmetic addition and returning the integer value.
// Main Class Analysis:

// In the Java Program to Add Two Numbers main class, First, we created an instance of the AddNumbers Class

// AddIntegerUsingOOps addNum = new AddIntegerUsingOOps();
// Next, we are assigning the user entered values to the AddNumbers Class variables.


// addNum.x = Number1;
// addNum.y = Number2;
// Next, we are calling the add method. Note, this method will add two numbers and print the output from the AddNumbers Class itself.

// addNum.add();
// Next, we are calling the addAgain method. Note, this is the second method with an integer data type.

// Sum = addNum.addAgain(Number1, Number2);

