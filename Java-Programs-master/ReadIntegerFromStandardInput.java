import java.util.Scanner;

public class ReadIntegerFromStandardInput {
    private static Scanner sc;

    public static void main(String[]args){
        sc=new Scanner(System.in);

        System.out.print("Enter Integer: ");

        int num = sc.nextInt();
        sc.close();

        System.out.println("Given Integer VAlue=" +num);
    }
}
