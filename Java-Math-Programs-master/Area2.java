public class Area2 {
    public static void main(String[]args){
        CalculateArea ob =new CalculateArea();
        ob.Area(4);
        ob.Area(10,12);
        ob.Area(5.5);
    }
}

class CalculateArea{
    void Area(float x){
        System.out.println("Area of the Square is: " +Math.pow(x,2) +" sq units");
    }
    void Area(float x, float y){
        System.out.println("Area of the Rectangle is: " + x*y +" sq units");
    }
    void Area(double x){
        double z= 3.14 * x * x;
        System.out.println("Area of the Circle is: " + z + " sq units");
    }
}