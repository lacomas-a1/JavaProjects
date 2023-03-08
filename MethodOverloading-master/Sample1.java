public class Sample1 {
    public static void main(String[]args){
        Simple1 obj=new Simple1();
        obj.add(10,20); //calling F1
        obj.add(30,40.92f); //calling F2
        obj.add(60.84f,20); //calling F3
    }
}
// In this Java Method Overloading example, the first statement allows us to create an instance of the Simple class

// Since we passed two integer values to the add, the compiler will call add(int a, int b)

// obj.add(10, 20); // F1
// Next line, we passed one integer value and a float value to the add. So the compiler will call add(int a, float b)


// obj.add(30, 40.92f); // F2
// Next line, we passed one float value and an integer value to the add. So the compiler will call the third one add( float a, int b)

// obj.add(60.98f, 20); // F3
