// Method Overloading in Java Example 2
// In this program, we will show how to perform Method Overloading in Java by changing the data type of arguments. In order to do so, First, we created a Class, and within the class, we defined three functions with the same name, but we changed the data type of both the arguments.

public class Simple {
    public void add(int a,int b){ //function F1
        System.out.format("The Sum of Two Values=%d\n",(a+b));
    }

    public void add(float a,float b){ //function F2
        System.out.format("The Sum of Two Floats=%.4f\n",(a+b));
    }

    public void add(String str1,String str2){//function F3
        System.out.format("The Sum of Three Numbers is= "+(str1 + str2));

    }
}

// Within the main program of a Java method overloading, we are creating the Object/instance of the above class. It allows us to call the functions inside the Sample./
//the main class of simple is Sample