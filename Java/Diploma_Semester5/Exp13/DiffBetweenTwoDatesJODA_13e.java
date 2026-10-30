package Exp13;

import java.time.LocalDate;

public class DiffBetweenTwoDatesJODA_11e {
        public static void main(String[] args) {
        LocalDate baseDate = LocalDate.of(2026, 10, 7);

        System.out.println("Original Date: " + baseDate);

        // Adding days, months, and years
        LocalDate futureDate = baseDate.plusYears(2).plusMonths(3).plusDays(10);
        System.out.println("Date after adding 2 Years, 3 Months, 10 Days: " + futureDate);

        // Subtracting days, months, and years
        LocalDate pastDate = baseDate.minusYears(1).minusMonths(2).minusDays(5);
        System.out.println("Date after subtracting 1 Year, 2 Months, 5 Days: " + pastDate);
    }
}
