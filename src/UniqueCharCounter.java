import java.util.HashSet;
import java.util.Set;

public class UniqueCharCounter {
    public int count(String phrase) {
        char[] hell = phrase.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char hellO: hell){
            set.add(hellO);
        }return set.size();
        }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}