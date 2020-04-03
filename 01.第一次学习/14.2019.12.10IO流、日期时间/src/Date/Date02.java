package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date02 {
    /*
        Java8 之后的时间api
     */
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.toLocalTime());
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2019, 12, 10, 12, 0);

        System.out.println(dateTime1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println(df.format(dateTime1));
        // 支持加 减 操作
        // 加两天
        LocalDateTime dateTime2 = dateTime1.plusDays(2);
        System.out.println(dateTime2);
        // 调整小时
        LocalDateTime dateTime3 = dateTime2.withHour(20);
        System.out.println(dateTime3);
        // isBefore判断当前时间是否在传入时间之前  isAfter判断之后
        System.out.println(LocalDateTime.now().isBefore(LocalDateTime.of(2020, 1, 1, 0, 0)));


    }
}
