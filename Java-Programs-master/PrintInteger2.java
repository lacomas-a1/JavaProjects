import java.util.Scanner;

public class PrintInteger2 {
    private static Scanner sc;

    public static void main(String[]args){
        int number;
        sc=new Scanner(System.in);

        System.out.print("Please Enter Integer value: ");
        number=sc.nextInt();

        System.out.println("\n The Integer value is: "+ number);
    }
}
