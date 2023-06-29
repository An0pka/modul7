public class NameCounter {
    public int count(String text){
        String [] words = text.split(" ");
        int count = 0;
        for (String st:words) {
            char[] liters = st.toCharArray();
            if (liters[0] >= 65 && liters[0] <= 90 && liters[1] >= 97 && liters[1] <= 122){
                count++;
            }

        }return count;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}