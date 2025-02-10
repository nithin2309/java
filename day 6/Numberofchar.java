
public class Numberofchar {

    public static void main(String[] args) {
        String s = "hey there how are you";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.equals("")) {
                count = 0;
                break;
            }
            if (s.charAt(i) == ' ') {
                count++;
            } else {
                continue;

            }
        }
        System.out.println("Number of words: " + count);
    }

}
