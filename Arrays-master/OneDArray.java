////    An Array in Java is a container object that holds a collection of similar types of elements (type may be integer, float, long, etc.). It means we cannot store multiple data type values.
//Data_Type[] Array_Name;
//Data_type: It will decide the type of elements array will accept. For example, If we want to store integer values, the Data Type will be declared as an int, to store Float values the Data Type is float
////        Array_Name: This is the name you want to give. For example, students, age, marks, emp
//
//    int [] anIntegerArray;
//    byte[] anByteArray;
//    short[] anShortArray;
//    long[] anLongArray;
//    float[] anFloatArray;
//    double[] anDoubleArray;
//    boolean[] anBooleanArray;
//    char[] anCharArray;
//    String[] anStringArray;

         //CREATE A JAVA ARRAY
//Create a Java Array
//        In order to create an array in Java, we have to use the New operator
//
//
//        Data_Type[] Array_Name = new Array_Name[Array_Size];
//        Array_Size: Number of elements an array can hold or store. For example, Array_Size =10, then it will hold 10 values.
//
//        If you already initialized an array in java then
//
//        int [] anIntegerArray; // Declaration
//
//// Crating it
//        anIntegerArray = new int[10];
//        For Example, int[] Student_Marks = new int[10];
//
//        We used int as the data type to declare an array. So, the above one will accept only integers. If we try to add float values, then it will throw an error.
//        Student_Age is the name
//        The size of an Array is ten. It means Student_Marks will only accept ten integer values.
//        If we try to store more than ten, then it throws an error.
//        We can store less than 10. For Example, If we store three integer values, then the remaining two values will be initialized to the default value (Which is 0).
//        Java Array Initialization
//        There are multiple ways to initialize the array in Java Programming language
//
//        First Approach
//        Declaring and Creating an Array in Java programming.
//
//        int[] Student_Marks = new int[3];
//
//
//        Initializing elements in more traditional way
//
//        Student_Marks[0] = 15; // Initializing First elements at position 0
//        Student_Marks[1] = 45; // Initializing elements at position 1
//        Student_Marks[2] = 65; // First elements at position 2
//        Second Approach to create an Array in Java
//        In this approach, We initialize the array at the declaration time only
//
//        int[] anIntegerArray = {15, 25, 35, 45, 55}

//
//        Here, We did not mention the size. However, the Javac is intelligent enough to determine the size by checking the number of elements.
//
//        Third Approach
//        Although this approach works without any error, this is not the preferred way to initialize in in Java Programming.
//
//        int Employees[ ] = {1, 2, 3, 4, 5}
//
//
//        Fourth Approach
////        The above 3 methods are good to store a small number of items into an array. What if we want to store 50, 100, or more values. It will be a torture to add all of them using any of the approaches mentioned above. To resolve this, we can use the loop concept to store data:
////
////        int i, Employees[100];
////
////        for (i =0; i < 100 ; i++)
////        {
//        Employees[i] = i * 2;
//        }
//        TIP: In order to store the elements, We can use For loop, While Loop and Do While Loop
//
//        Fifth Approach of creating an array in Java
//        int[] anIntegerArray = new int[5];
//        anIntegerArray[0] = 10;
//        anIntegerArray[1] = 20;
//        anIntegerArray[2] = 30;
//
//        Here we declared an anIntegerArray array of size 5, but we only assigned three values to it. In this condition, the remaining values assigned to default values (0 in this case).
//
//        The above one will be:
//
//        anIntegerArray[0] = 10
//        anIntegerArray[1] = 20
//        anIntegerArray[2] = 30
//        anIntegerArray[3] = 0
//        anIntegerArray[4] = 0
//
//        Accessing Java Array Elements
//        We use the index position to access the items of an Array in Java. Using an index, we can access or alter/change the item. Index value starts at 0 and ends at n-1, where n is the size or length.
//
//        For example, if it stores ten elements, the index starts at 0 and ends at 9. To access or modify the first value, use Array_Name[0] and to access or alter 10th value, use Array_Name[10]. Let us see the example for better knowledge of accessing Java array elements:

package Array;

public class OneDArray {
    public static void main(String[]args){
        int[]anIntegerArray={15,25,35,45,55,65};

        System.out.println(anIntegerArray[0]);
        System.out.println(anIntegerArray[1]);
        System.out.println(anIntegerArray[2]);
        System.out.println(anIntegerArray[3]);
        System.out.println(anIntegerArray[4]);
        System.out.println(anIntegerArray[5]);
    }
}

