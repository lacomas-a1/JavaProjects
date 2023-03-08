package Array;

public class MultiDArray {
    public static void main(String[]args){
        int[][][]a= { { {2, 4, 6, 8}, {12, 14, 16, 18}, {22, 24, 26, 28} },
                { {32, 34, 36, 38}, {52, 54, 56, 58}, {72, 74, 76, 78} } };
        int[][][]b= { { {10, 20, 30, 40}, {50, 60, 70, 80}, {100, 110, 120, 140} },
                { {150, 160, 170, 180}, {190, 200, 220, 240}, {250, 270, 290, 300} }
        };

        int [][][]Sum=new int[2][3][4];
        int tables,rows,columns;
        for(tables=0;tables<a.length;tables++){
            for (rows=0;rows<a.length;rows++){
                for(columns=0;columns<a.length;columns++){
                    Sum[tables][rows][columns]=a[tables][rows][columns]+b[tables][rows][columns];
                }
            }
        }
        System.out.println("Sum of those Two Arrays are:");
        for(tables=0;tables<a.length;tables++){
            for(rows=0;rows<a[0].length;rows++){
                for(columns=0;columns<=a[1].length;columns++){
                    System.out.format("%d \t",Sum[tables][rows][columns]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

//
//n this Java Multi Dimensional Array example, First, We declared two 3 Dimensional Arrays a, b of size [2],[3], and initialized with some random values. We also declared an empty array of size[2],[3]
//
//        Below For loop will help to iterate every cell present in both a and b. Condition inside the for loops (rows < a[0].length) will ensure the compiler, not to exceed the array row limit and (columns < a[1].length) will ensure the compiler not to exceed the array column limit.
//
//        TIP: a.length is to find the level of data (first dimension), a[0].length is used to find the length of the rows (second dimension) and a[1].length is used to find the length of the columns (third dimension).
//

//        for(tables = 0; tables < a.length; tables++) {
//        for(rows = 0; rows < a[0].length; rows++) {
//        for(columns = 0; columns <= a[1].length; columns++) {
//        Sum[tables][rows][columns] = a[tables][rows][columns] + b[tables][rows][columns];
//        }
//        }
//        }
//        Let us see the Java Multi Dimensional Array program in the iteration wise
//
//        Tables First Iteration
//
//        The value of tables = 0, and the condition (tables < 2) is True. So, it will enter into second for loop (Row Iteration).
//
//
//        Row First Iteration
//
//        The value of the row = 0, and the condition (rows < 2) is True. So, it enters into second for loop.
//
//        Column First Iteration

//        The value of the column= 0, and the condition (columns < 3) is True. So, it will start executing the statements inside the loop until the condition fails.
//
//        Sum[tables][rows][columns] = a[tables][rows][columns] + b[tables][rows][columns];
//        Sum[0][0][0] = a[0][0][0] + b[0][0][0] = 2 + 10 = 12;
//        The value of column will increment by 1
//
//        Second Iteration
//
//        The value of the column= 1, and the condition (columns <= 3) is True. Since we didn’t exit from the inner loop (Columns loop), the row value is still 0
//
//        Sum[0][0][1]= a[0][0][1] + b[0][0][1] = 4 + 20;
//        Sum[0][0][1]= 24;
//        column incremented by 1
//
//        3rd Iteration

//        The value of the columns is 2, and the condition (columns <= 3) is True. Since we didn’t exit from the inner loop (Columns loop), the row value will be 0
//
//        Sum[0][0][2] = a[0][0][2] + b[0][0][2] = 6 + 30;
//        Sum[0][0][2] = 36;
//        column incremented by 1
//
//        fourth Iteration
//
//        The value of the column= 3, and the condition (columns <= 3) is True. Since we didn’t exit from the inner loop (Columns loop), the row value will be 0
//
//        Sum[0][0][3] = a[0][0][2] + b[0][0][2] = 8 + 40;
//
//        Sum[0][0][3] = 48;
//
//
//        From the fourth iteration, the value of the columns became 4, and the condition (columns <= 3) will fail. So it will exit from the loop. Now the value of rows will be incremented by 1 and starts the second row iteration
//
//        Java Multi Dimensional Array – Row Second Iteration
//
//        The value of row will be 1 and the condition (rows < 2) is True. So, it will enter into second for loop
//
//
//        Column First Iteration
//
//        The value of the column= 0, and the condition (columns <= 3) is True. So, it will start executing the statements inside the loop until the condition fails.
//
//        Sum[0][1][0] = a[0][1][0] + b[0][1][0];
//        Sum[0][1][0] = 12 + 50 = 62;
//        column incremented by 1
//
//
//        Second Iteration
//
//        The value of the columns= 1, and the condition (columns <= 3) is True.
//
//        Sum[0][1][1]= a[0][1][1] + b[0][1][1] = 14 + 60;
//        Sum[0][1][1]= 74;
//        The value of column will be incremented by 1

//
//        3rd Iteration
//
//        The value of the columns= 2, and the condition (columns <= 3) is True.
//
//        Sum[0][1][2] = a[0][1][2] + b[0][1][2] = 16 + 70;
//        Sum[0][1][2] = 86;
//        fourth Iteration
//
//        The value of the columns= 3, and the condition (columns <= 3) is True.
//
//        Sum[0][1][3] = a[0][1][2] + b[0][1][2] = 18 + 80;
//        Sum[0][1][3] = 98;
//        After the increment, the value of columns will be four, and the condition (columns <= 3) will fail. So it will exit from the Column For loop. Next, the value of rows will be incremented by 1. It means rows = 2. Condition (rows < 2) will fail. So, it will exit from the Row loop.
//
//        Now, the value of tables will be incremented by 1. It means tables = 1, and the Condition (tables < 2) is TRUE. So, it will start executing Tables Second Iteration. Repeat the above process for one more time to get the remaining results.
//
//
//        Next for loops in the Java Multi Dimensional Array will traverse, as we explained above. However, instead of summing, it will display the values one by one with tab separation using the system.out.format statement inside them.
//

