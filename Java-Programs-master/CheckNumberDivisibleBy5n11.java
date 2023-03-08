import java.util.Scanner;

public class CheckNumberDivisibleBy5n11 {
    private static Scanner sc;
    public static void main(String[]args){
        int num;
        sc=new Scanner(System.in);

        System.out.print("Please Enter Number:");
        num=sc.nextInt();

        if((num%5==0 ) && (num % 11 ==0)){
            System.out.println("\n given number" +num + " is divisible by 5 and 11");
        }
        else{
            System.out.println("\n given number" +num + " is not divisible by 5 and 11");
        }
    }
}
