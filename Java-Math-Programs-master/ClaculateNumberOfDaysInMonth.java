public class ClaculateNumberOfDaysInMonth {
    public static void main(String[]args){
        int Month =2;
        int Year =2000;
        int NumDays=0;

        switch(Month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                   NumDays=31;
                   break;
            case 4: case 6: case 9: case 11:
                   NumDays=30;
                   break;
            case 2:
                   if(((Year % 4 ==0) && !(Year % 100==0)) || (Year % 400==0))
                            NumDays=29;
                   else
                            NumDays=28;
                        break;
            default:
                 System.out.println("Invalid Month.");
                 break;
        }
        System.out.println("Number of Days:" + NumDays);
    }
}
