package SimpleConditions;

public class Level1_9 {
    static void main() {
        String res = checkVorC('@');
        System.out.println(res);
    }

    public static String checkVorC(char val) {
        String ans = "";
        if ((val >= 'A' && val <= 'Z') || (val >= 'a' && val <= 'z')) {
            if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' || val == 'A' || val == 'E' || val == 'I' || val == 'O' || val == 'U') {
                ans= "Character is vowel";

            } else {
                ans= "Character is consonant";

            }
        }else{
            ans = "Not a character";
        }
        return ans;
    }

}
