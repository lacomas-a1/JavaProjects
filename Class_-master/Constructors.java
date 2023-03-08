public class Constructors {
    int x;
    
    //Create a class constructor for the  Constructor.
    public Constructors(){
        x=5;
    }

    public static void main(String[]args){
        Constructors myObj =new Constructors();//create object of the class that will call the constructor
        System.out.println(myObj.x);//print value of x
    }
}
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes: