public class ConstructorParameters {
    int ModelYear;
    String ModelName;

    public ConstructorParameters(int year, String name){
        ModelYear =year;
        ModelName=name;
    }
    public static void main(String[]args){
        ConstructorParameters myCar =new ConstructorParameters(2021, "Ferona");
        System.out.println(myCar.ModelYear +" "+ myCar.ModelName );
    }
}
