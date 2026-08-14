package module1.DataTypesControl.Q14;

public class ControlStatements {
     public static void main(String[] args) {

        int number = 8;

        // if-else
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

       // switch
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }

        // for loop
        System.out.println("Numbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
    