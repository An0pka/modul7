public class AvgWordLength {
    public double count(String phrase){
        int count =0;
        int cwords = 0;
        String[] words = phrase.split(" ");
        for (String st:words) {
            count += st.length();
            cwords++;
        }
        return (double) count/cwords;
    }
}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
