package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int y = c.get(Calendar.YEAR);
        System.out.println(y);

        int m = c.get(Calendar.MONTH) + 1;
        System.out.println(m);

        int d = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(d);

        int w = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(w);

        int h = c.get(Calendar.HOUR_OF_DAY);
        System.out.println("时:" + h);

        int mm = c.get(Calendar.MINUTE);
        System.out.println("分:" + mm);

        int ss = c.get(Calendar.SECOND);
        System.out.println("秒: " + ss);

        int ms = c.get(Calendar.MILLISECOND);
        System.out.println("毫秒：" + ms);

        Date date = c.getTime();
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        System.out.println(time);
    }
}
