package com.modernjava.java16.dayPeriod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author kansanja on 27/02/24.
 */
public class DayPeriodDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String currentTime = DateTimeFormatter.ofPattern("EEEE,MMMMM d, yyyy, hh:mm:ss a").format(localDateTime);
        System.out.println(currentTime);

        // B in the pattern will display morning, afternoon or night - DayPeriod support added in java16
        String currentTime1 = DateTimeFormatter.ofPattern("EEEE,MMMMM d, yyyy, hh:mm:ss B").format(localDateTime);
        System.out.println(currentTime1);

    }
}
