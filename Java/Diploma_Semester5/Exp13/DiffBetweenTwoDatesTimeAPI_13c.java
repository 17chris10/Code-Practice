package Exp13;

import java.time.LocalDate;
import java.time.Period;

public class DiffBetweenTwoDatesTimeAPI_13c {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 15);
        LocalDate endDate = LocalDate.of(2026, 10, 7);

        // Period class calculates difference in Years, Months, and Days
        Period period = Period.between(startDate, endDate);

        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Difference: " + period.getYears() + " Years, " 
                           + period.getMonths() + " Months, " 
                           + period.getDays() + " Days");
    }
}