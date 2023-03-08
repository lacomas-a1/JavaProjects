import java.util.Scanner;
public class javaprogram {
    private static Scanner sc;
    public static void main(String[]args){
        int Num1,Num2,Sum,Sub;

        sc =new Scanner(System.in);
        System.out.println("Enter Name: ");
        String str=sc.nextLine();

        System.out.println("Enter Num1:");
        Num1=sc.nextInt();
        System.out.println("Enter Num2: ");
        Num2=sc.nextInt();

        //computation
        Sum=Num1+Num2;
        Sub=Num1-Num2;

        System.out.println("Sum:"+ Sum);
        System.out.println("Subtraction:"+ Sub);
        
        System.out.println("Name: "+ str);

    }
}
