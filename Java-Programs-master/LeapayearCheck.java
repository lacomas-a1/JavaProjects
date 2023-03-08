
import java.util.Scanner;

public class LeapayearCheck {
    private static Scanner sc;

    public static void main (String[]args){
        int year;
        sc=new Scanner(System.in);

        System.out.println("Enter Year: ");
        year=sc.nextInt();

        if (year%4==0 && year%2==0){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not Leap Year");
        }
    }
}
