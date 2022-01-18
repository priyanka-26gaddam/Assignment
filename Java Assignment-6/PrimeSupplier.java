package com.java.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class PrimeSupplier {
    public static void main(String[] args) {


        LocalDate cal
                = LocalDate.of(
                2000, 12, 23);

        LocalDate cal2
                = LocalDate.of(
                2001, 12, 23);



        List<LocalDate> calendarList = new LinkedList<>();
        calendarList.add(cal);
        calendarList.add(cal2);

        for (LocalDate c : calendarList) {
            String formattedDate = c.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (c.isLeapYear()) {
                System.out.println(formattedDate + " is a leap year");

            } else {
                System.out.println(formattedDate + " is not a leap year");
            }
        }
    }
}
