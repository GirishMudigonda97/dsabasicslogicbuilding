package SimpleConditions;

public class Level1_6 {
    static void main() {
    int result = larger(10,5);
        System.out.println(result);
    }

    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
