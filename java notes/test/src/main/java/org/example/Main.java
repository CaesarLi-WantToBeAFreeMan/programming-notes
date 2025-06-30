package org.example;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String [] args){
        //create instances
        LocalTime now = LocalTime.now();
        System.out.println("now:\t" + now);
        LocalTime time0 = LocalTime.of(12, 45, 30, 750_123_456);
        System.out.printf(
            "hour of time0:\t%d\nminute of time0:\t%d\nsecond of time0:\t%d\nnanosecond of time:\t%d\n",
            time0.getHour(),
            time0.getMinute(),
            time0.getSecond(),
            time0.getNano()
        );
        LocalTime parsed = LocalTime.parse("06:04");
        System.out.println("parsed:\t" + parsed);

        //comparisons
        System.out.printf(
            "is time0 equals midnight:\t%b\nis time0 before now:\t%b\nis time0 after now:\t%b\n",
            time0.equals(now),
            time0.isBefore(now),
            time0.isAfter(now)
        );

        //modifications
        time0.plusHours(1);
        time0.plus(15, ChronoUnit.MINUTES);
        System.out.println("after adding 75 minutes:\t" + time0);
        time0.withNano(0);
        time0.with(ChronoField.SECOND_OF_MINUTE, 0);
        System.out.println("after setting nanosecond and second to 0:\t" + time0);

        //conversion
        System.out.printf(
            "nanosecond of day:\t%d\nformat string:\t%s\n",
            time0.toNanoOfDay(),
            time0.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        );

        //extra methods

        System.out.printf(
                "time0 is supported for ChronoFielf.SECOND_OF_MINUTE:\t%b\nrange of minute of hour:\t%s\ntruncate to minutes:\t%s\n",
                time0.isSupported(ChronoField.SECOND_OF_MINUTE),
                time0.range(ChronoField.MINUTE_OF_HOUR),
                time0.truncatedTo(ChronoUnit.MINUTES)
        );
    }
}