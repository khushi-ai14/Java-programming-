package module3.Q25;

import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {
    public void displayDateTime() {
        Date currentDate = new Date();
        System.out.println("Current Date and Time using Date class: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date using Calendar class: " 
            + calendar.get(Calendar.DAY_OF_MONTH) + "/"
            + (calendar.get(Calendar.MONTH) + 1) + "/"
            + calendar.get(Calendar.YEAR));
            
        System.out.println("Current Time using Calendar class: " 
            + calendar.get(Calendar.HOUR_OF_DAY) + ":"
            + calendar.get(Calendar.MINUTE) + ":"
            + calendar.get(Calendar.SECOND));
    }
}


class TestDateTimeDemo {
    public static void main(String[] args) {
        DateTimeDemo demo = new DateTimeDemo();
        demo.displayDateTime();
    }
}