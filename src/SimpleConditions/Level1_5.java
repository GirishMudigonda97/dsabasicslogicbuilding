package SimpleConditions;


public class Level1_5 {

    static void main() {
    boolean answer =leapyear(1992);
        System.out.println(answer);
    }

    public static boolean leapyear(int year) {
        boolean leap = false;
        if ((year % 4 ==0 && year % 100 !=0) || year % 400==0){
            leap = true;
        }
        return leap;
    }

    }

