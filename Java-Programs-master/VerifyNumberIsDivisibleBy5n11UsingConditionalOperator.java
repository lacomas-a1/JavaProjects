import java.util.Scanner;

public class VerifyNumberIsDivisibleBy5n11UsingConditionalOperator {
    private static Scanner sc;
    public static void main(String[]args){
        int num;
        sc=new Scanner(System.in);

        System.out.println("Enter a Number:");
        num=sc.nextInt();

        String message=((num % 5 ==0) && (num % 11 ==0))? " is Divisible By 5 and 11": "is NOT Divisible By 5 and 11";
        System.out.println("\n Number " + num + message);
    }
}
