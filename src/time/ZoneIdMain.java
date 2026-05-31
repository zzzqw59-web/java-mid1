package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String available : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(available);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZonId.systemDefault = " + zoneId);

        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZone = " + seoulZone);
    }
}
