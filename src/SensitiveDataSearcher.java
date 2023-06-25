public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] words = phrase.split(" ");
        for (String chack : words) {
            if (chack.replaceAll("[^A-Za-z ]", "").equalsIgnoreCase("pass") || chack.replaceAll("[^A-Za-z ]", "").equalsIgnoreCase("key")
                || chack.replaceAll("[^A-Za-z ]", "").equalsIgnoreCase("login") ||chack.replaceAll("[^A-Za-z ]", "").equalsIgnoreCase("email")){
                return true;
            }
        }
        return false;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
