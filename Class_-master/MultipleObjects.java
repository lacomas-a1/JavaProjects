public class MultipleObjects {
    int x=5;//Attributes
    int y=7;//Attributes


    //Accessing Attributes.
    public static void main(String[]args){
        MultipleObjects myObj1= new MultipleObjects();
        MultipleObjects myObj2= new MultipleObjects();

        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
    }
}
