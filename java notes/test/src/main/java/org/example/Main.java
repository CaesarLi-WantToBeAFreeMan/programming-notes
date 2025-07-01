package org.example;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main{
    public static void main(String [] args){
        //creation
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now:\t" + now);
        OffsetDateTime offset0 = OffsetDateTime.of(2024, 12, 25, 10, 30, 0, 0, ZoneOffset.ofHours(2));
        System.out.printf(
            "offset of offset0:\t%s\nyear of offset0:\t%d\nmonth of offset0:\t%s\nday of month of offset0:\t%d\nhour of offset0:\t%d\nminute of offset0:\t%d\nsecond of offset0:\t%d\nnanosecond of offset0:\t%d\n",
            offset0.getOffset(),
            offset0.getYear(),
            offset0.getMonth(),
            offset0.getDayOfMonth(),
            offset0.getHour(),
            offset0.getMinute(),
            offset0.getSecond(),
            offset0.getNano()
        );
        OffsetDateTime parsed = OffsetDateTime.parse("2025-01-01T12:00:00+02:00");
        System.out.println("parsed:\t" + parsed);

        //modifications
        System.out.println("adding 84 hours:\t" + now.plus(5, ChronoUnit.HOURS).plusDays(3));

        //comparisons
        System.out.printf(
            "is offset0 after now:\t%b\n",
            offset0.isAfter(now)
        );

        //formatting
        System.out.println("formatted offset0:\t" + offset0.format(DateTimeFormatter.ofPattern("MM dd, yy HH:mm:ss (Z)")));
    }
}