import java.util.Arrays;

public class DigitExtracter {
    public int[] extract(String text){
        text = text.replaceAll("[^0-9]", "");
        char[] word = text.toCharArray();
        int [] dick = new int[word.length];
        for (int i = 0; i < word.length; i++) {
            dick[i] = Character.getNumericValue(word [i]);
        }
        return dick;
    }
}
class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}