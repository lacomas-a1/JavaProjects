import java.util.Scanner;
public class FindAreaTrapezium {
    public static void main(String[]args){
        //Take input from the user 
        //Create an instance of the Scanner Class

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length longer side:");
        Double a=sc.nextDouble();
        System.out.println("Enter length shorter side:");
        Double b=sc.nextDouble();
        System.out.println("Enter length non-paralle side:");
        Double c=sc.nextDouble();
        System.out.println("Enter length non-parallel side:");
        Double d=sc.nextDouble();

        Double s=(a+b+c+d)/2;
        Double num=(s-a)*(s-b)*(s-b-c)*(s-b-d);
        Double res=Math.sqrt(num);

        //Calculate th area
        Double Area=(a+b)/(a-b)*res;
        if (a<=0 || b<=0 || c<=0 || d<=0){
            System.out.println("Length is Positive");
        }
        else{
            System.out.println("Area of Trapezium: " +Area);
        }

    }
}
