package com.modernjava.enhancedswitch;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {
    public static int getDays(Month month, int year) {
        int noOfDays = 0;
        switch (month) {
            case SEPTEMBER:
            case APRIL:
            case JUNE:
            case NOVEMBER:
                noOfDays = 30;
                //return noOfDays;
                break;
            case FEBRUARY: // this is a code block;
                System.out.println("Checking if " + year + " is a leap year");
                noOfDays = Year.isLeap(year) ? 29 : 28;
                //  return noOfDays;
                break;

            default:
                noOfDays = 31;
        }
        return noOfDays;

    }

    /**
     * Enhanced switch is introduced in Java 14
     * Enhanced switch is an expression rather than statement so return is placed on the switch itself
     * Multiple labels are allowed
     * break is replaced by arrow and value ( -> value)
     * Enhanced switch should be exhaustive (we should cover all scenarioes otherwise compiler complaints)
     * we can also have null as caseLabel - for Type pattern matching. Introduced in Java 21
     */

    public static int getDaysUsingEnhancedSwitch(Month month, int year) {

        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
//            case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
            case FEBRUARY -> {
                System.out.println("Check if year " + year + "is a leap year ?");
                yield Year.isLeap(year) ? 29 : 28;
            }
            default -> 31;
        };
    }

    public static int getDaysUsingEnhancedSwitchExhaustive(Month month, int year) {

        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
//            case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
            case FEBRUARY -> {
                System.out.println("Check if year " + year + "is a leap year ?");
                yield Year.isLeap(year) ? 29 : 28;
            }
            // No need of Default case as we are covering all possible scenarioes(Exhaustive)
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        };
    }
}
