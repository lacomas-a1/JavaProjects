public class ContinueStatements {
    public static void main(String[]args){
        String searchme="peter pipper picked a "+ " pack of picked papers";
        int max =searchme.length();
        int numbs=0;

        for (int i=0; i<max; i++){
            //intrested only in p's
            if (searchme.charAt(i) !='p')
                continue;
                //process p's
                numbs ++;
        }
        System.out.println("Found "+numbs +"p's in the string");
    }
}
