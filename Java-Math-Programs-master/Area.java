// Find Area of Square,Rectangle and Circle Using Method Overloading

public class Area {
    public static void main(String[]args){
        Rectangle obj=new Rectangle();

        //calling function
        obj.Area(30,20);
        obj.Area(12.5,4.5);
        Circle obj1 = new Circle();

        obj1.Area(3);
        obj1.Area(5.5);
        Square obj2= new Square();

        obj2.Area(20);
        obj2.Area(5.2);
    }
}

class Square{
    //Overloade function to calculate the area of the square
    //It takes one double parameter.
    void Area(double side){
        System.out.println("Area of the Square: " +side * side);
    }

    // Overload function to calculate the area of the square
    //It takes one float parameter.
    void Area(float side){
        System.out.println("Area of the Square is:" + side * side);
    }
}

class Circle{
    static final double PI=Math.PI;
    //Overloaded function to calculate the area of the circle 
    //It takes one double paremeter
    void Area(double r){
        double A=PI * r * r;
        System.out.println("Area of the Circle is: "+ A);
    }
    void Area(float r){
        double A=PI * r * r;
        System.out.println("Area of the Circle is: " +A);
    }
}

class Rectangle{
    //Overload function to calculate the are of the Rectangle
    // It takes a double Paremeter
    void Area(double l, double w){
        System.out.println("Area of the Rectangle is: " + l * w);
    }
    void Area(int l, int w){
        //Area takes two float Parematers.
        System.out.println("Area of the Rectangle is: "+ l * w);
    }
}

// Find Area of Square,Rectangle and Circle Using Method Overloading