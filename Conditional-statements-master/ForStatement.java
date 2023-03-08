public class ForStatement {
    public static void main(String[]args){
        for (int i=1; i< 11; i++){
            System.out.println("Count is: "+ i);
        }
    }
}

// for (initialization; termination;
// increment) {
// statement(s)
// }
// When using this version of the for statement, keep in mind that:
// 
// 
// 
// The initialization expression initializes the loop; it's executed once, as the loop begins.
// When the termination expression evaluates to false, the loop terminates.
// The increment expression is invoked after each iteration through the loop; it is perfectly
// acceptable for this expression to increment or decrement a value.
