
public class WaterCounter {
    public double count(String text){
        int count = 0;
        String textik = text.replaceAll(" ", "");
        char[] word = text.toCharArray();
        for (char ch:word) {
            if (ch == ' '){
                count++;
            }

        }
        return (double) count/text.length();
    }
}
class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
