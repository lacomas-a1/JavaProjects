public class MthodIfElse {
    //Create a checkAge() method with an integer variable called a
    static void checkAge(int age){
        if (age<18){
            System.out.println("Access denied -You are not old enough");
        }
        else{
            System.out.println("Access granted- You are old enough!");
        }
    }
    public static void main(String[]args){
        checkAge(20);
    }
}
