package com.modernjava.java12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author kansanja on 21/02/24.
 */
public class CompactNumberFormat {
    public static void main(String[] args) throws ParseException {

        // we can represent numbers in shortForm & long form using this CompactNumberFormat

        var shortForm = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        System.out.println("ShortForm value is: " + shortForm.format(1000));
        System.out.println("ShortForm value is: " + shortForm.format(100000_0));

        var longForm = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        System.out.println("LongForm value is: " + longForm.format(1000));
        System.out.println("LongForm value is: " + longForm.format(100000_0));

        System.out.println("LongForm value is: " + longForm.parse("1 thousand"));

    }
}
