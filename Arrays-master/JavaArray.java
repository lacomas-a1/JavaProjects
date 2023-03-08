package Array;

public class JavaArray {
    public static void main(String[]args){
        int i,Sum =0;
        int[] anIntegerArray={10,20,30,40,50,60,70,80,90,100};

        for(i=0; i<anIntegerArray.length; i++){
            Sum = Sum+anIntegerArray[i];

            System.out.format("Addition of %d to Sum= %d \n",anIntegerArray[i],Sum);
        }
        System.out.format("Sum of the element in anIntegerArray=%d \n",Sum);
    }
}


//In this Java array example Program, We declared 1 One Dimensional anIntegerArray[] with 10 elements and also declared i to iterate the elements,
//
////int [] anIntegerArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//The For loop iterate every cell in the anIntegerArray[4] array. The condition inside the for loops (i < anIntegerArray.length) will ensure the Jcompiler not exceed the array limit.
//
//        Sum = Sum + anIntegerArray[i]; statement is used to add each and individual element present in the anIntegerArray to Sum variable.
//        System.out.format statement displays the Sum value after every iteration.
//        anIntegerArray.length finds the length of it
//Java Array First Iteration: The value of i will be 0, and the condition (i < 10) is True. So, it will start executing the statements inside the loop.
//
//        Sum = Sum + anIntegerArray[i]
//
//        => Sum + anIntegerArray[0]
//
//        Sum = 0 + 10 = 10
//
////        The value of i will be incremented by 1
//Second Iteration: The value of i is 1, and the condition (1 < 10) is True.
//
//        Sum = Sum + anIntegerArray[1]
//        Sum = 10 + 20 = 30
//
/////
//Third Iteration: After the increment, the i = 2, and the condition (2 < 10) is True.
//
//        Sum += anIntegerArray[2]
//        => 30 + 30 = 60
//Fourth Iteration: The value of i is 3, and the condition (3 < 5) is True.
//
//        Sum = 60 + 40 = 100
//
//Fifth Iteration: i = 4, and the condition (4 < 10) is True.
//
//        Sum = 100 + 50 = 150
//
//Sixth Iteration: i is 5, and the condition (5 < 10) is True.
//
//        Sum = 150 + 60 = 210
////
////Seventh Iteration: After increment, i = 6, and the condition (6 < 10) is True.
////
////
////        Sum = 210 + anIntegerArray[6] => 210 + 70 = 280
//Eighth Iteration: i = 7, and the condition (7 < 10) is True.
//
//        Sum = 280 + anIntegerArray[7] => 280 + 80 = 360
//
//9th Iteration: i is 8, and the condition (8 < 10) is True.
//
//        Sum = 360 + anIntegerArray[8] => 360 + 90 = 450
//
//10th Iteration: i is 9 and the condition (9 < 10) is True.
//
//        Sum = Sum + anIntegerArray[9]
//        Sum = 450 + 100 = 550
//
//11th Iteration: The value of i is 10, and the condition (10 < 10) is False. So, it will exit from the for loop.
//

