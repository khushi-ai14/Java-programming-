package module1.StringOperations.Q50;

public class StringPalindrome {
    public static void main(String[] args) {

        String text = "malayalam";
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
