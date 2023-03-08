import java.util.Scanner;

public class CalculateCompoundIntrests {
    private static Scanner sc;
    public static void main(String[]args){
        double PAmount,ROI,TimePeriod;
        sc=new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        PAmount=sc.nextDouble();

        System.out.print("Enter Rate Of Interest: ");
        ROI=sc.nextDouble();

        System.out.print("Enter the Time Period In Years: ");
        TimePeriod=sc.nextDouble();

        CalCompoundIntrests(PAmount,ROI,TimePeriod);
    }
    public static void CalCompoundIntrests(double PAmount,double ROI,double TimePeriod){
        double FutureCI,CI;
        FutureCI=PAmount * (Math.pow((1+ROI/100),TimePeriod));
        CI=FutureCI-PAmount;

        System.out.println("Future Compound Intrest for " +PAmount+ " is: "+ FutureCI);
        System.out.println("Compound Intrest for "+PAmount +" is:"+CI);
    }
}
