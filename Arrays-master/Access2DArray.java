// package Array;

public class Access2DArray {
    public static void main(String[]args){
        int[][]a={{15,25,35},{45,55,65}};
        int[][]b={{12,22,32},{55,25,85}};
        int[][]Sum=new int[2][3];
        int rows,columns;

        for(rows=0; rows<a.length;rows++){
            for(columns=0;columns<a[0].length;columns++){
                Sum[rows][columns]=a[rows][columns]+b[rows][columns];
            }
        }
        System.out.println("Sum of thow Two Arrays Are:");
        for(rows=0; rows<a.length;rows++) {
            for (columns = 0; columns < a[0].length; columns++) {
                System.out.format("%d\t", Sum[rows][columns]);
            }
            System.out.println("");
        }
    }
}
//n this two dimensional array program, First, We declared 2 two Dimensional Arrays a, b of size [2],[3], and initialized with some random values. We also declared an empty array of size[2],[3]
//
//        int[][] a = { {15, 25, 35}, {45, 55, 65} };
//        int[][] b = {{12, 22, 32}, {55, 25, 85} };
//        int[][] Sum = new int[2][3];
//        Below For loop will help to iterate every cell present in both a and b array. Condition inside the for loops (rows < a.length) will ensure the Jcompiler not exceed the array row limit. Furthermore, (rows < a[0].length) will ensure the compiler not exceed the array column limit.
//
//        TIP: a.length is to find the length of the rows (first dimension), and a[0].length is to find the length of the columns (second dimension).
//

//    for(rows = 0; rows < a.length; rows++) {
//        for(columns = 0; columns < a[0].length; columns++) {
//        Sum[rows][columns] = a[rows][columns] + b[rows][columns];
//        }
//        }
//        Let us see the Java two dimensional array program execution in iteration wise
//
//        Row First Iteration
//
//        The value of the row will be 0, and the condition (rows < 2) is True. So, it will enter into second for loop.
////    Column First Iteration
//
//        The valueof the column will be 0, and the condition (columns < 3) is True. So, it will start executing the statements inside the loop until the condition fails.
//
//        Sum[rows][columns] = a[rows][columns] + b[rows][columns];
//        Sum[0][0] = a[0][0] + b[0][0];
//        Sum[0][0] = 15 + 12;
//        Sum[0][0] = 27;
////        The value of the column incremented by 1
//Column Second Iteration
//
//        The value of the column is 1, and the condition (columns < 3) is True. Since we did not exit from the inner loop (Columns loop), the row value is still 0.
//
//        Sum[0][1]= a[0][1] + b[0][1];
//        Sum[0][1]= 25 + 22 = 47;
//        The value of the column incremented by 1
//
//
////        Column 3rdlumns] = a[rows][columns] + b[rows][columns];
//        Sum[1][0] = a[1][0] + b[1][0];
//        Sum[1][0] = 4 Iteration
//
//        The value of columns is 2, and the condition (columns < 3) is True. Since we did not exit from the inner loop, the row value will be 0.
//
//        Sum[0][2] = a[0][2] + b[0][2];
//        Sum[0][2] = 35 + 32 = 67;
//        After the increment, the value of columns will be 3, and the condition (columns < 3) will fail. So it will exit from the loop.
//
//
//        Now the value of rows will be incremented by one and starts the second-row iteration.
//
//        Second Row Second Iteration
//
//        The value of the row will be 1, and the condition (rows < 2) is True. So, it will enter into second for loop.
//
//
//        Column First Iteration
//
//        The value of the column is 0, and the condition (columns < 3) is True. So, it will start executing the statements inside the loop until the condition fails.
//
//        Sum[rows][co5 + 55;
//        Sum[1][0] = 100;
//        The value of the column incremented by 1
//
//
//        Column Second Iteration
//
//        The value of the column is 1, and the condition (columns < 3) is True. Since we did not exit from the Columns loop, the row value will be 1
//
//        Sum[1][1]= a[1][1] + b[1][1];
//        Sum[1][1]= 55 + 25;
//        Sum[1][1]= 80;
//        The value of the column incremented by 1
//
//
//        Column 3rd Iteration
//
//        The value of columns is 2, and the condition (columns < 3) is True. Since we did not exit from the inner loop (Columns loop), the row value will be 1.
////
//        Sum[1][2] = a[1][2] + b[1][2] = 65 + 85;
//        Sum[1][2] = 150;
//        After the increment, the value of columns will be three, and the condition (columns < 3) will fail. So it will exit from the loop. Now the value of rows will increment by 1. It means rows = 2. Condition (rows < 2) will fail. So, it will exit from the loop.
//
//        Next for loops will traverse, as we explained above. However, instead of summing, it will display the values one by one with comma separation using the system.out.format statement inside them.
//
//        for(rows = 0; rows < a.length; rows++) {
//        for(columns = 0; columns < a[0].length; columns++) {
//        System.out.format("%d \t", Sum[rows][columns]);
//        }
//        System.out.println("");
//        }
//        The final output of the Java two dimensional array (Sum array) is:
//
//        Sum[2][3] = { {27, 47, 67}, {100, 80, 150} };

