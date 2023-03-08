import java.util.Scanner;

public class GetInputFromUser {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print(" Enter Integer VAlue= ");
        int x = sc.nextInt();
        System.out.println("User Entered Interger Value= " + x);

        System.out.print("\n Enter Double Value= ");
        double y = sc.nextDouble();
        System.out.println("User Entered Double Value= " + y);

        System.out.print("\n Enter Float Value= ");
        float z = sc.nextFloat();
        System.out.println("User Entered Float Value= " + z);


    }
}
