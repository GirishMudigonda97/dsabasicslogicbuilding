package SimpleConditions;

public class Level1_10 {

    static void main() {
        System.out.println(check('A'));
    }

    public static String check(char val){
        if (val>='A' && val<='Z'){
            return "char is uppercase";

        } else if (val >= 'a' && val<= 'z') {
            return "char is smallcase";
        } else if (val >= '0' && val <= '9') {
            return "char is digit";
        }
        else{
            return "it is not character";
        }
    }
}
