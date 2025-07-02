package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.TextStyle;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class Main{
    public static void main(String [] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        LocalDateTime now = LocalDateTime.now();

        // Prepare a list of ZoneInfo objects with properties for sorting
        var zones = zoneIds.stream()
                .map(ZoneId::of)
                .map(zoneId -> {
                    ZoneOffset offset = now.atZone(zoneId).getOffset();
                    return new ZoneInfo(zoneId, offset);
                })
                .collect(Collectors.toList());

        // Sort by offset ascending, then zone ID lex
        zones.sort(Comparator
                .comparing((ZoneInfo z) -> z.offset.getTotalSeconds())
                .thenComparing(z -> z.zoneId.getId()));

        // Print markdown header
        System.out.println("| zone id           | time zone name                    | description                       | time zone     |");
        System.out.println("| :---------------: | :---------------------------: | :-------------------------------: | :-----------: |");

        // Print each zone info in markdown row
        for (ZoneInfo z : zones) {
            String id = z.zoneId.getId();
            String fullName = z.zoneId.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            String shortName = z.zoneId.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
            String description = extractDescription(id);
            String offsetStr = formatOffset(z.offset);

            System.out.printf("| `%s` | %s (`%s`) | %s | `%s` |\n",
                    id,
                    fullName,
                    shortName,
                    description,
                    offsetStr);
        }
    }

    // Helper class to hold zone info
    static class ZoneInfo {
        ZoneId zoneId;
        ZoneOffset offset;

        ZoneInfo(ZoneId zoneId, ZoneOffset offset) {
            this.zoneId = zoneId;
            this.offset = offset;
        }
    }

    // Extract a readable description from the zone id string
    private static String extractDescription(String zoneId) {
        String[] parts = zoneId.split("/");
        if (parts.length == 1) return parts[0];

        StringBuilder desc = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {
            if (desc.length() > 0) desc.append(", ");
            desc.append(parts[i].replace('_', ' '));
        }
        return desc.toString();
    }

    // Format the offset like GMT/UTC +3 or GMT/UTC -04:30
    private static String formatOffset(ZoneOffset offset) {
        int totalSeconds = offset.getTotalSeconds();
        if (totalSeconds == 0) return "GMT/UTC +0";

        int absTotalSeconds = Math.abs(totalSeconds);
        int hours = absTotalSeconds / 3600;
        int minutes = (absTotalSeconds % 3600) / 60;

        return String.format("GMT/UTC %s%d%s",
                totalSeconds >= 0 ? "+" : "-",
                hours,
                minutes == 0 ? "" : String.format(":%02d", minutes));
    }
}