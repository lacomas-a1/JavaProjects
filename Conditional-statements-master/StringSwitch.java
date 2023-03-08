package Descion_making_statements;

import java.util.Scanner;

public class StringSwitch {
    private static Scanner sc;
    public static void main(String[]args){
        String Month,Message;
        sc=new Scanner(System.in);
        System.out.println("Please Enter any Month Name: ");
        Month=sc.next();

        SwitchClass swt=new SwitchClass();
        Message =swt.stringSwitch(Month);
        System.out.println(Message);
    }
}


// we are using the string data as the Switch case option. In this java switch statement example, we are dividing the code using the Object-Oriented Programming. To do this, First, we will create a class that holds methods.