package Descion_making_statements;

import java.util.Scanner;

public class Switch {
    private static Scanner sc;
    public static void main(String[]args){
        int number1, number2;
        char operator;
        sc =new Scanner(System.in);
        System.out.println("Pleas Enter two values to perform Arthmetic Operations");
        number1= sc.nextInt();
        number2= sc.nextInt();
        System.out.println("Please Select any ARTHMETIC OPERATOR you wish!\n");
        operator=sc.next().charAt(0);

        switch(operator){
            case'+':
            System.out.format("Addition of two number is: %d", number1 + number2);
            break;
            case'-':
            System.out.format("Subtraction of two number is: %d", number1 - number2);
            break;
            case'*':
            System.out.format("Multiplication of two number is: %d", number1 * number2);
            break;
            case'/':
            System.out.format("Division of two number is: %d", number1 / number2);
            break;
            case'%':
            System.out.format("Module of two number is: %d", number1 % number2);
            break;
            default:
            System.out.println("You havae entered the Wrong operator\n");
            System.out.println("Please enter the Correct operator such as +,*,*,/,%");
        }
    }
}

// If the user enters / as an operator, the code inside the / section will print. And if the user enters % as an operator, the println inside the % section will print.
// 

// And if the user entered operator (character) is not in any of the above (operator not equal to +, -, *, / or %), the following default statement will print.
