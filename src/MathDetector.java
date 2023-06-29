public class MathDetector {
    public boolean isMath(String text){
        int count = 0;
        boolean rovno = false;
        boolean aperands = false;
        char[] word = text.toCharArray();
        for (char temp:word){
            if (temp == '='){
                rovno = true;
            } else if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                aperands = true;
            } else if (temp >= 48 && temp <= 57) {
                count++;
            }


        }if (rovno == true && aperands == true && count >=2){
            return true;
        }return false;
    }

}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}