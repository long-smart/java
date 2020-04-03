package Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date05 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now.getEpochSecond()); // 秒
        System.out.println(now.toEpochMilli()); // 毫秒
        System.out.println(now);

        ZonedDateTime zd = now.atZone(ZoneId.systemDefault());
        System.out.println(zd);
        System.out.println(zd.toLocalDateTime());
    }
}
