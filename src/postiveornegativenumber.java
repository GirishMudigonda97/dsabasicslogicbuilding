import java.util.Scanner;

public class postiveornegativenumber {
    static void main() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
       int num = sc.nextInt();
        if (num>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
    }
}
