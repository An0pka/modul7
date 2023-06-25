public class SummaryCreator {
    public String create(String text){
        char[] da = text.toCharArray();
        if(da.length <= 15){
            return text;
        }
        String result = "";

        for (int i = 0; i < da.length; i++) {
            while (i <= 14){
                result += da[i];
                i++;
            }
            if (i == 15 && da[i] != ' ') {
                return result + "...";
            }if (i > 15){
                return result.trim();
            }

        }return null;
    }
}
class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "qutejidyhybeciz sin";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "cezupekixiybciWcfovoqi";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
