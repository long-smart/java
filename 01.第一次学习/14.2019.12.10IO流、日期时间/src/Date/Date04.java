package Date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date04 {
    public static void main(String[] args) {
        /*
            时区
         */

        ZonedDateTime zd = ZonedDateTime.now();
        ZonedDateTime zd1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zd);
        System.out.println(zd1);
    }
}
