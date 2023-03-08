public class Sample2 {
    public static void main(String[]args){
        Simple2 obj= new Simple2();
        obj.add(15,45); //F1
        obj.add(30,90,220); //F2
    }
}

// The following statement in the method overloading allows us to create an instance of the Simple class

// Simple obj = new Simple();
// Since we passed two integer values to the add, the compiler will call the first one: dd(int a, int b)


// obj.add(15, 45); 
// Next line, we passed one integer value and two long values to the add. So the compiler will call the second: public void add(int a, long b, long c). Here, the function will implicitly convert the integer value to long and perform the addition operation.

// obj.add(30, 90, 220); 