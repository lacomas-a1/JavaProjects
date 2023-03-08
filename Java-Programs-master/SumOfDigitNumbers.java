import java.util.*;

public class SumOfDigitNumbers {
    int sum=0;
    int sumOfDigit(long Num)
    {
        if(Num!=0){
            sum+=Num%10;
            Num/=10;
            sumOfDigit(Num);
        }
        return sum;
    }
    public static void main(String[]args){
        long num,res;
        SumOfDigitNumbers main= new SumOfDigitNumbers();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Digits:");
        num = sc.nextLong();
        System.out.println("The Sum of dogits is "+main.sumOfDigit(num));
    }
}
