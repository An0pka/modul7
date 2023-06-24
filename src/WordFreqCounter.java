public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        int count = 0;
        String[] words = phrase.split(" ");
        for (String value : words) {
            if (value.equalsIgnoreCase(word) ) {
                count++;
            }
        }
        return (float) count / words.length;

    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}