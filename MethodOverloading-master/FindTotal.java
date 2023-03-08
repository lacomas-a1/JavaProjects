public class FindTotal {
    public static void main(String[]args){
        Example obj=new Example();
        obj.sum(10,20); //calling F1
        obj.sum(10,20,40); //calling F2
    }
}


// Within this Java method overloading program, the following statement allows us to create an instance of the Example class

// Example obj = new Example();
// Since we passed two arguments to the sum, the compiler will call the first one: public void sum(int a, int b)

// obj.sum(10, 20);
// Next line, we passed three arguments to the sum. So the compiler will call the second one: public void sum(int a, int b, int c)


// obj.sum(10, 20, 40);