package module1.StringOperations.Q48;

public class CharacterFrequency {
    public static void main(String[] args) {

        String text = "hello";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {

                if (text.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}
