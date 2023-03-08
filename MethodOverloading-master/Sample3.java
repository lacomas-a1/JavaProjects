public class Sample3 {
    public static void main(String[]args){
        Simple obj=new Simple();
        obj.add(15,45);
    }
}

// Within this example, the below statement allows us to create an instance of the Simple class.

// Simple obj = new Simple();
// Here the compiler will not understand which one of them it has to call. Because both the first: public void add(int a, long b)and the second function: public void add(int a, long b) is true. That is why it will throw an error stating that the function is Ambiguous.

// obj.add(15, 45);