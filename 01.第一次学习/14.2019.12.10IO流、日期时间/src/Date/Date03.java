package Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Date03 {
    public static void main(String[] args) {
        /*
            Duration 表示两个时间 之前的 间隔
            Period 表示两个日期之前的间隔
         */
//        LocalDateTime start = LocalDateTime.of(2000, 7, 6, 23, 12, 12, 123);
//        LocalDateTime end = LocalDateTime.now();
//
//        Duration d1 = Duration.between(start, end);
//        System.out.println(d1);

        Period p1 = LocalDate.of(2000, 7, 6).until(LocalDate.now());
        System.out.println(p1);
        System.out.println(p1.get(ChronoUnit.YEARS));
    }
}
