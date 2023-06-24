public class PalindromeCounter {
    public int count(String phrase){
        int count = 0;
        String[] words = phrase.split(" ");
        for (String lol : words) {
            if (lol.equalsIgnoreCase(new StringBuilder(lol).reverse().toString())){
                count++;
            }
        }return count;
    }
}
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}