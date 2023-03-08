package Descion_making_statements;

public class WhileloopBreakStatement {
    public static void main(String[]args){
        int i=10;

        while(i >0){
            if(i==4){
                System.out.format("\n Coming out from While i=%d",i);
                break;
            }
            System.out.format("%d",i);
            i--;
        }
    }
}

// Within this Java Break Statement example, First, We initialized the value of i as: i = 10 at the beginning of the code. Within the While loop, we check for the condition whether i is greater than 0 or not.
// 
// while ( i > 0)  {
// Inside the While, we placed if condition to test whether i is equal to 4.

// If the condition is false, then it will skip it and prints that number as output (In Our case 10, 9, 8, 7, 6, 5).
// If this condition is True, then the statement will execute, and the iteration will stop at that number without printing the System.out.format(“%d”, i).
