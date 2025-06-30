package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main{
    public static void main(String [] args){
        //creation
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now:\t" + now);
        ZonedDateTime zone0 = ZonedDateTime.of(2024, 12, 25, 10, 30, 0, 0, ZoneId.of("America/Los_Angeles"));
        System.out.printf(
            "zone of zone0:\t%s\nyear of zone0:\t%d\nmonth of zone0:\t%s\nday of month of zone0:\t%d\nhour of zone0:\t%d\nminute of zone0:\t%d\nsecond of zone0:\t%d\n",
            zone0.getZone(),
            zone0.getYear(),
            zone0.getMonth(),
            zone0.getDayOfMonth(),
            zone0.getHour(),
            zone0.getMinute(),
            zone0.getSecond()
        );
        ZonedDateTime parsed = ZonedDateTime.parse("2025-01-01T12:00:00-05:00[Asia/Taipei]");
        System.out.println("parsed:\t" + parsed);

        //modifications
        System.out.println("adding 84 hours:\t" + now.plus(5, ChronoUnit.HOURS).plusDays(3));

        //comparisons
        System.out.printf(
            "is zone0 after now:\t%b\n",
            zone0.isEqual(now)
        );

        //formatting
        System.out.println("formatted zone0:\t" + zone0.format(DateTimeFormatter.ofPattern("MM dd, yy HH:mm:ss (Z)")));
    }
}