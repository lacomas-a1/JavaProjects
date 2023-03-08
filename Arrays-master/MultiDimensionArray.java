package Array;

public class MultiDimensionArray {
    public static void main(String[]args){
        int[][][]StudentArray={{{10,20,30},{50,6070},{80,90,100},{110,120,130}},{{15,25,35},{22,44,66},{33,55,77},{78,57,76}}};

        System.out.println("Element at StudentArray[0][0][0] = " + StudentArray[0][0][0]);
        System.out.println("Element at StudentArray[0][0][1] = " + StudentArray[0][0][1]);
        System.out.println("Element at StudentArray[0][0][2] = " + StudentArray[0][0][2]);
        System.out.println("Element at StudentArray[0][1][0] = " + StudentArray[0][1][0]);
        System.out.println("Element at StudentArray[0][1][1] = " + StudentArray[0][1][1]);
        System.out.println("Element at StudentArray[0][1][2] = " + StudentArray[0][1][2]);
        System.out.println("Element at StudentArray[0][2][0] = " + StudentArray[0][2][0]);
        System.out.println("Element at StudentArray[0][2][1] = " + StudentArray[0][2][1]);
        System.out.println("Element at StudentArray[0][2][2] = " + StudentArray[0][2][2]);
        System.out.println("Element at StudentArray[0][3][0] = " + StudentArray[0][3][0]);
        System.out.println("Element at StudentArray[0][3][1] = " + StudentArray[0][3][1]);
        System.out.println("Element at StudentArray[0][3][2] = " + StudentArray[0][3][2]);

        //Accessing Second Table Rows & Columns
        System.out.println("=============");
        System.out.println("Element at StudentArray[1][0][0] = " + StudentArray[1][0][0]);
        System.out.println("Element at StudentArray[1][0][1] = " + StudentArray[1][0][1]);
        System.out.println("Element at StudentArray[1][0][2] = " + StudentArray[1][0][2]);
        System.out.println("Element at StudentArray[1][1][0] = " + StudentArray[1][1][0]);
        System.out.println("Element at StudentArray[1][1][1] = " + StudentArray[1][1][1]);
        System.out.println("Element at StudentArray[1][1][2] = " + StudentArray[1][1][2]);
        System.out.println("Element at StudentArray[1][2][0] = " + StudentArray[1][2][0]);
        System.out.println("Element at StudentArray[1][2][1] = " + StudentArray[1][2][1]);
        System.out.println("Element at StudentArray[1][2][2] = " + StudentArray[1][2][2]);
        System.out.println("Element at StudentArray[1][3][0] = " + StudentArray[1][3][0]);
        System.out.println("Element at StudentArray[1][3][1] = " + StudentArray[1][3][1]);
        System.out.println("Element at StudentArray[1][3][2] = " + StudentArray[1][3][2]);
    }

}
//
//    In order to create a multi dimensional array in Java, we have to use the New operator
//
//    Data_Type[][][] Array_Name = new int[Tables][Row_Size][Column_Size];
//    If you observe the above code snippet of this Java Multi Dimensional Array,
//
//
//        Tables: Total number of tables it can accept. 2D Array is always a single table with rows and columns. In contrast, Multi Dimensional array in Java is more than one table with rows and columns.
//        Row_Size: Number of Row elements. For example, Row_Size = 5, then the 3D array holds five rows.
//        Column_Size: Column elements it can store. Column_Size = 6, then the 3D array holds 6 Columns.
//
//    int [][][] Employees = new int[2][5][3];
//
//Here, we used int as the data type to declare an array. It means the above one will accept only double values, and if you try to add float or double values, it will throw an error.
//        Employees is the name of the Java Multi Dimensional Array
//        The number of tables = 2. So, this Multi dimensional array will hold a maximum of 2 levels of data (rows and columns).
//        The Row size is 5, and it means Employees will only accept five integer values as rows.
//        If we try to store more than five values, then it will throw an error.
//        We can store less than 5. For Example, If we store three integer values, then the remaining two values will be initialized to a default value (Which is 0).
//        And the Column size is three; it means Employees will only accept three integer values.
//        If we try to store more than three, then it will throw an error.
//        We can store less than 3. For Example, If we store one integer values, then the remaining two values will be initialized to the default value (Which is 0).
//        Finally, the Employees can hold a maximum of 24 integer values (2 * 4 * 3 = 24).