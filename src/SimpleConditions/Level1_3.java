package SimpleConditions;

import java.util.Scanner;

public class Level1_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println(n + " is divisible");
        }
        else{
            System.out.println(n + " is not divisible");
        }
        sc.close();
    }
}
