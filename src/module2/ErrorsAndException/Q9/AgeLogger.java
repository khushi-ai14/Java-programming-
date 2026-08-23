package module2.ErrorsAndException.Q9;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AgeLogger {

    private static final Logger logger =
            Logger.getLogger(AgeLogger.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileHandler fileHandler =
                    new FileHandler("error.log", true);

            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Invalid age: Age must be 18 or above." );
            }

            System.out.println("You are eligible.");
            logger.info("User entered a valid age.");
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
            logger.severe(e.getMessage());

        } 
        catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            logger.severe(e.getMessage());

        } 
        finally {
            sc.close();
        }
    }
}
