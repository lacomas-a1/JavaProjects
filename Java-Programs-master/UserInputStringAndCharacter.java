// In this Java get input from User program, we used nextLine(), next().charAt(0), nextByte() to read string, character, and byte from console.


import java.util.Scanner;

public class UserInputStringAndCharacter {
    private static Scanner sc;

    public static void main(String[]args){
        sc=new Scanner(System.in);

        System.out.print(" Enter Any String:");
        String str=sc.nextLine();
        System.out.println("User Entered String :" +str);

        System.out.print(" Enter Any String:");
        char ch=sc.next().charAt(0);
        System.out.println("User Entered String :" +str);

        System.out.print(" Enter Any Byte:");
        Byte b=sc.nextByte();
        System.out.println("User Entered Byte :" +str);    
    }

    
}