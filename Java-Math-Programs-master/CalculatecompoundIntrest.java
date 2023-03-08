// The above formula is to calculate Future Compound Interest because it contains both the Principal Amount and CI. To get the Compound Interest, use the below formula:

// CI = Future CI – Principal Amount

import java.util.Scanner;

public class CalculatecompoundIntrest {
    // Future CI = Principal Amount * ( 1 + Rate of Interest )Number of years)
    private static Scanner sc;
    public static void main(String[]args){
        double PAmount,ROI,TimePeriod,FutureCI,CI;
        sc=new Scanner(System.in);

        System.out.print("Enter The Principal Amount: ");
        PAmount=sc.nextDouble();

        System.out.print("Enter The Rate of Intrest: ");
        ROI=sc.nextDouble();

        System.out.print("Enter the Time Period In Years: ");
        TimePeriod=sc.nextDouble();

        FutureCI=PAmount * (Math.pow((1+ROI/100), TimePeriod));
        CI=FutureCI-PAmount;

        System.out.println("\n The Future Compound INtrest for Principal Amount " + PAmount + " is:" +FutureCI);
        System.out.println("The Compound Interest for Principal amount " + PAmount+ " is: " +CI);
    }
}
