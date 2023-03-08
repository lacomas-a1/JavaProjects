import java.util.Scanner;

public class Grade {
    private static Scanner sc;
    public static void main(String[]args){
        int Num;
        sc=new Scanner(System.in);

        System.out.println("Enter Marks: ");
        Num=sc.nextInt();

        if (Num >=80){
            System.out.println("A");
        }
        else if(Num>=70 && Num <80){
            System.out.println("B+");
        }
        else if(Num>=60 && Num <70){
            System.out.println("B");
        }
        else if(Num>=50 && Num <60){
            System.out.println("C+");
        }
        else if(Num>=40 && Num <50){
            System.out.println("C");
        }
        else{
            System.out.print("D");
        }
    }
}
