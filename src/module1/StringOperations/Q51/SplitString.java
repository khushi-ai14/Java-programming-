package module1.StringOperations.Q51;

public class SplitString {
    public static void main(String[] args) {

        String text = "Java is easy and interesting ";

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }  
}
