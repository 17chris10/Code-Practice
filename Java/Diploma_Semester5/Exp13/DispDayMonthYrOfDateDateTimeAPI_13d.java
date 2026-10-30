package Exp13;

import java.time.LocalDate;

public class DispDayMonthYrOfDateDateTimeAPI_13d {
    public static void main(String[] args) {
        LocalDate givenDate = LocalDate.of(2026, 10, 7);

        System.out.println("Given Date: " + givenDate);
        System.out.println("Day of Week: " + givenDate.getDayOfWeek());
        System.out.println("Month: " + givenDate.getMonth());
        System.out.println("Year: " + givenDate.getYear());
    }
}
