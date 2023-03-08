public class Paremeter {
    static void myMethod(String fname){ //method that takes a String called fname as parameter.
        System.out.println(fname +" Refsnes");
    }
    public static void main(String[]args){
        myMethod(" Liam");
        myMethod(" Jenny");
        myMethod(" Anja");
    } 
}
// When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

