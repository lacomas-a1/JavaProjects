public class AddComplexNumbers {
    // In this Java add example, we created a constructor to initialize the complex numbers. Next, created an instance of that class with default values.
    double real,imaginary;

    AddComplexNumbers(double r,double i){
        this.real=r;
        this.imaginary=i;
    }
    public static void main(String args[]){
        addComplexNumbers cn1=new addComplexNumbers(10.7,22.5);
        addComplexNumbers cn2=new addComplexNumbers(28.2,68);

        addComplexNumbers addition=sum(cn1,cn2);
        System.out.printf("\n ComplexNumber sum: "+ addition.real+ "+" +addition.imaginary + "i");
    }

    public static addComplexNumbers sum(addComplexNumbers cn1, addComplexNumbers cn2){
        addComplexNumbers addition =new addComplexNumbers(0,0);
        addition.real = cn1.real +cn2.real;
        addition.imaginary=cn1.imaginary +cn2.imaginary;

        return addition;
    }
}


// Java Program to Add Two Complex Numbers
// Write a Java program to add two complex numbers with an example. Unfortunately, complex Numbers have a real part and imaginary part, and it is tricky to perform addition on two of them. 

// For example, 5 + 10i means 5 is a real part, and 10 is an imaginary part. And adding another one 11 + 9i has to give 16 + 19i.