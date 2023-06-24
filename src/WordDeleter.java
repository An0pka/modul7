public class WordDeleter {
    public String remove(String phrase, String[] words){
        StringBuilder newbie = new StringBuilder();
        String[] phrases = phrase.split(" ");
        for (int i = 0; i < phrases.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(!(phrases[i].equalsIgnoreCase(words[j]))){
                    continue;

                }newbie.append(phrases[i]).append(" ");

            }
        }return newbie.toString().trim();
    }
}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("sydiesu hidi vys coe egces zyryzai",
                new String[] {"egces" , "vys" , "coe" , "hidi"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}