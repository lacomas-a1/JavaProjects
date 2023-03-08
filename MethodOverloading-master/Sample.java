public class Sample {
    public static void main(String[]args){
        Simple obj=new Simple();
        obj.add(10,20); //calling F1
        obj.add(20.34f,40.92f);//calling F2
        obj.add("Avator"," Classes"); //calling F3
    }
}

// The first statement in the Java method overloading allows us to create an instance of the Simple class

// Since we passed two integer values to the add, the compiler will call the first one: public void add(int a, int b)

 // obj.add(10, 20);
//  Next line, we passed two float values to the add. So the compiler will call the second: public void add(float a, float b)

//  obj.add(20.34f, 40.92f); 
//  Next line of Java Method Overloading example, we passed two strings to the add. Here, the compiler will call the third one: public void add(String str1, String str2) to perform string concatenation
 
 
//  obj.add("Tutorial ", "Gateway"); 