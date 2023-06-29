public class BigOrSmall {
    public String calculate(String text){
        char[] word = text.toCharArray();
        int countBig = 0;
        int countSmall = 0;
        for (char ch: word) {
            if (ch >= 65 && ch <= 90){
                countBig++;
            }if (ch >= 97 && ch <= 122){
                countSmall++;
            }
        }if (countBig > countSmall){
            return "Big";
        } else if (countSmall >countBig) {
            return  "Small";
        } else if (countSmall == countBig) {
            return  "Some";

        }return null;
    }
}
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}