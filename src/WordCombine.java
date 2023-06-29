import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        char[] wordA = sourceWord.toCharArray();
        char[] wordB = targetWord.toCharArray();
        Set<Character> charSew = new HashSet<>();
        for (char ch: wordA) {
            charSew.add(ch);
        }
        boolean count = false;
        int s = 0;
        for (char ch: charSew) {
            for (int i = 0; i < wordB.length; i++) {
                if (wordB[i] == ch || wordB[i]==(ch+32) || (wordB[i]+32)==ch || (wordB[i]+32)==(ch+32)){
                    count = true;
                    s++;
                }
            }
        }
        if (s == wordB.length){
            return true;
        }return false;
    }
}
class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("NQAOZZOU", "qona"));

//        //true
//        System.out.println(new WordCombine().canCombine("Magic", "Mama"));
//
//        //false
//        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
