public class Break_Statement {
    public static void main(String[]args){
        int [] arrayOfInts={32,87,3,589,12,1076,2000,8,622,37};
        int searchfor = 12;

        int i;
        boolean foundIt =false;

        for(i=0; i <arrayOfInts.length; i++){
            if (arrayOfInts[i]==searchfor){
                foundIt=true;
                break;
            }
        }
        if (foundIt){
            System.out.println("Found " + searchfor + " at index" + i);
        }
        else{
            System.out.println(searchfor + " no in the array");
        }
    }
}
// #program to search for value=12 in array
