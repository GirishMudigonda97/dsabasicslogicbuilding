package SimpleConditions;

public class Level1_8 {
    static void main() {
        String result =checktemp(25);
        System.out.println(result);
    }

    public static String checktemp(int tempval){
        if (tempval< 20){
            return "Cold";
        } else if (tempval>=20 && tempval<=30) {
            return "warm";
        }
        else{
            return "hot";
        }
    }
}
