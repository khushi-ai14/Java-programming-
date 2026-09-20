package module3.Q26;

public class TestEmailValidator {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();

        String[] testEmails = {
            "khushi123mdf@gmail.com",
            "email.123.com"
        };

        for (String email : testEmails) {
            boolean isValid = validator.isValidEmail(email);
            System.out.println(email + " -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
}
