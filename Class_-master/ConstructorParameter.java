public class ConstructorParameter {
    int x;

    public ConstructorParameter(int y){
        x=y;
    }

    public static void main(String[]args){
        ConstructorParameter myObj=new ConstructorParameter(8);
        System.out.println(myObj.x);
    }
}
