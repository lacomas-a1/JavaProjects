public class CopyingArrays {
    public static void main(String[]args){
        char[] copyFrom = {'d','e','c','b','u','y','t','e','a','d'};
        char[] copyTo= new char[7];

        System.arraycopy(copyFrom, 3, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
