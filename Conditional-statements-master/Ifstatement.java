package Descion_making_statements;

import java.util.Scanner;

public class Ifstatement {
    private static Scanner sc;
    public static void main(String[] args){
        int Number;
        sc =new Scanner(System.in);
        System.out.println("Please Enter an interger");
        Number = sc.nextInt();

        if(Number > 1){
            System.out.println("\nYou have entered a POSITIVE Number");
        }
        System.out.println("This Message is coming from Outside the IF STATEMENT");
    }
}
