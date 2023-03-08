//Create Two dimen
////
////        Data_Type[][] Array_Name = new int[Row_Size][Column_Size];
////        If we observe the above two dimensional array code snippet,
////
////        Row_Size: Number of Row elements an array can store. For example, Row_Size = 5, then the array will have five rows.
////        Column_Size: Number of Column elements an array can store. For example, Column_Size = 6, then the array will have 6 Columns.
////        If you already initialized a two dimensional array in Java, then
////
////        double [][] anStudentArray; // Declaration of Two dimensional array in java
////
////// Crating an Java two dimensional Array
////        anStudentArray = new int[5][3];
////        For Example,
////
////        double [][] Employees = new double[5][3];
////
//////        Here, wesional Array in Java
//        In order to create a two dimensional array in Java, we have to use the New operator as we shown below:
// used double as the data type to declare a two dimensional array in Java. It means, the above array will accept only double values, and if you try to add float values, then it will throw an error.
//        Employees is the name of the Two Dimensional Array
//        The Row size of an Array is 5, and it means Employees array will only accept 5 double values as rows.
//        If we try to store more than 5 values, then it will throw an error.
//        We can store less than 5. For Example, If we store 2 integer values, then the remaining 2 values will be initialized to the default value (Which is 0).
//        The Column size of an Array is 3. It means Employees array will only accept 3 integer values as columns.
//        If we try to store more than 3, then it will throw an error.
//        We can store less than 3. For Example, If we store 1 integer value, then the remaining 2 values will be initialized to the default value (Which is 0).
//        Initialization of Two Dimensional Array in Java
//        We can initialize the Java Two Dimensional Array in multiple ways. Please refer to Arrays and Multi-Dimensional Array in Java Programming.
//
//        Two Dimensional Array First Approach
//        Declaring and Creating a Two Dimensional Array in Java
//
//        int[][] Student_Marks = new int[2][3];
//
//        Initialize Array elements more traditionally.
//
//        Student_Marks[0][0] = 15; // Initializing Array elements at position [0][0]
//        Student_Marks[1][1] = 45; // Initializing Array elements at position [1][1]
//        Student_Marks[2][1] = 65; // Initializing Array elements at position [2][1]
//        Java two dimensional array Second Approach
//        The second approach of declaring and Creating a Two Dimensional Array

//
//        int[][] Student_Marks = new int[2][];
//
//        Here, We did not mention the column size. However, the Jcompiler is intelligent enough to calculate the size by checking the number of elements inside the column.
//
//        Java two dimensional array Third Approach
//        int[][] Employees = { {10, 20, 30}, {15, 25, 35}, {22, 44, 66}, {33, 55, 77} };
//
//
//        Here, We did not mention the row size and column size. However, the compiler is intelligent enough to calculate the size by checking the number of elements inside the row and column.
//
//        Fourth Approach
//        The above 3 ways are good to store a small number of elements into the two dimensional array in Java, What if we want to store 100 rows or 50 column values. It will be a nightmare to add all of them using any of the approaches mentioned above. To resolve this, we can use the Nested For Loop concept here:
//
//        int rows, columns;
//        int[][] Employees = new int[100][50];
//
//        for (rows = 0; rows < 100 ; rows++) {
//        for (columns = 0; columns < 50; columns++) {
//        Employees[rows][columns] = rows + columns;
//        }
//        }
//        TIP: In order to store the elements in a Java Two Dimensional Array, We can use For loop, While Loop and Do While Loop
//
//
//        Fifth Approach for Two Dimensional array in Java
//        int[][] anIntegerArray = new int[5][3];
//        anIntegerArray[0][0] = 10;
//        anIntegerArray[0][1] = 20;
////        anIntegerArray[0][2] = 30;
////
////        Here we declared a Java two dimensional array of size 5 rows * 3 columns, but we only assigned values for one row. In this situation, the remaining values assigned to default values (0 in this case).
////
////        Access Java Two Dimensional Array Elements
////        In Java programming, We can use the index position to access the two dimensional array elements. Using the index, we can access or alter/change every individual element present in a two dimensional array.
////
//
//        An index value of a Java two dimensional array starts at 0 and ends at n-1 where n is the size of a row or column. For example, if an int[][] Array_name = new int[6][4] will stores 6 row elements and 4 column elements.
//
//        To access or alter 1st value use Array_name[0][0], to access or alter 2nd row 3rd column value then use Array_name[1][2] and to access the 6th row 4th column then use Array_name[5][3]. Let’s see the example of the two dimensional array for better understanding:



        package Array;

public class TwoDArray {
    public static void main(String[]args){
        int[][] StudentArray={{12,22,33},{45,65,95},{442,444,446},{785,786,787}};

        System.out.println("Element at StudentArray[0][0]="+StudentArray[0][0]);
        System.out.println("Element at StudentArray[0][1]="+StudentArray[0][1]);
        System.out.println("Element at StudentArray[0][2]="+StudentArray[0][2]);
        System.out.println("Element at StudentArray[1][0]="+StudentArray[1][0]);
        System.out.println("Element at StudentArray[1][1]="+StudentArray[1][1]);
        System.out.println("Element at StudentArray[1][2]="+StudentArray[1][2]);
        System.out.println("Element at StudentArray[2][0]="+StudentArray[2][0]);
        System.out.println("Element at StudentArray[2][1]="+StudentArray[2][1]);
        System.out.println("Element at StudentArray[2][2]="+StudentArray[2][2]);
    }
}


//    In order to work with a large number of rows and columns, we have to use For loop. Let us access the above array StudentArray[4][3] using For loop.
//
//        int rows, columns;
//
//        for (rows = 0; rows < 4; rows++) {
//        for (columns = 0; columns < 3; columns++) {
//        System.out.format("%d", StudentArray[rows][columns]);
//        }
//        }
