package SimpleConditions;

import java.util.Scanner;

public class Level1_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0 ){
            System.out.println(n + " is divisible by 3 and 5");
        }
        else if (n % 3 == 0){
            System.out.println(n + " is divisible by 3");
        }
        else if (n % 5 == 0){
            System.out.println(n + " is divisible by 5");
        }
        else {
            System.out.println(n + " is not divisible by 3 or 5");
        }
    }
}
