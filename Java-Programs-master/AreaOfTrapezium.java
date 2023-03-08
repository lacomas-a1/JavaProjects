import java.util.Scanner;

public class AreaOfTrapezium {
    private static Scanner sc;
    
    public static void main(String[]args){
        //Take input from the user 
        //Create an instance of the Scanner Class

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the parallel side:");
        Double side1=sc.nextDouble();
        System.out.println("Enter the length of the parallel side:");
        Double side2=sc.nextDouble();
        System.out.println("Enter the height:");
        Double height=sc.nextDouble();

        //calculate area;
        Double area=((side1+side2)*height)/2;
        if(side1<=0 || side2<=0){
            System.out.println("Length shoul be positive");
        }
        else{
            System.out.println("Area of Trapezium is: " +area);
        }
    }
}
