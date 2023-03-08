public class StaticAndPublicMethod {
    //static method.
    static void myStaticMethod(){
        System.out.println("Static Method Called without Creating Objects");
    }
    //public Method
    public void myPublicMethod(){
        System.out.println("Public Methods must be Called by Creating Objects");
    }
    //Main Methods
    public static void main(String[]args){
        myStaticMethod();//call static mehod

        StaticAndPublicMethod myObj=new StaticAndPublicMethod();//Create an object of staticAndPublic Methods.
        myObj.myPublicMethod();//call the public method on the object
    }
}
