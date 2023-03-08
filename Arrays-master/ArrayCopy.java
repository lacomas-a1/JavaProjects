public class ArrayCopy {
    public static void main(String[]args){
        char[] copyFrom = {'d','e','c','b','u','y','t','e','a','d'};
        char[] copyTo= java.util.Arrays.copyOfRange(copyFrom,3,9);

        System.out.println(new String(copyTo));
    }
}
