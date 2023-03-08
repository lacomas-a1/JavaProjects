public class Breakstatement {
    public static void main(String[]args){
        int [][] arrayOfInts={{32,87,3,65},{12,34,5567,77},{34,87,97,45,24}};
        int searchfor =12;

        int i;
        int j=0;
        boolean foundIt = false;

        search:
        for (i=0; i<arrayOfInts.length; i++){
            for(j=0; j<arrayOfInts[i].length; j++){
                if (arrayOfInts[i][j]==searchfor){
                    foundIt=true;
                    break search;
                }
            }
        }
        if (foundIt){
            System.out.println("Found "+ searchfor + " at" +i  + j);
        }
        else{
            System.out.println(searchfor + " not in the array");
        }

    }
}
