public class EmailDetector {
    public boolean isPresent(String text){
        String [] words = text.split( " ");
        for (String st:words) {
            if (st.equals(" @") || st.equals("@ ") || st.equals(" @ ") || st.equals("@")){
                return false;
            } else if (st.length() >=5 && st.contains("@")) {
                return true;
            }
        }return false;
    }
}
class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}