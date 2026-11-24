package SimpleConditions;

public class Level1_7 {
    static void main() {
        int a = lar1(80,60,40);
        int b = shortversion(20,60,40);
        System.out.println(b);
    }

    public static int lar1(int a, int b ,int c){
    if (a > b && a > c){
        return a;
    }else{
        if (b>c){
            return b;
        }
        else {
            return c;
        }
    }
    }


    public static int shortversion(int a, int b, int c){
        if (a> b && a> c){
            return a;
        } else if (b>c) {
            return b;
        }else{
            return c;
        }
    }
}
