import java.util.EnumMap;
import java.util.Map;

public class EnumMap01 {
    public static void main(String[] args) {
        /*
            HashMap内部使用数组来保存 Entry<Key, value> (空间换时间), 使用 HasCode方法返回一个int值来确立一个key在数组中的索引
            做为Key的对象必须实现 equals和hasCode方法, 并遵循相应的规则

            EnumMap适用于key是一个Enum类型, 不需要HasCode方法, 所以性能非常高
         */
        Map<Weekday, String> map = new EnumMap<>(Weekday.class);

        map.put(Weekday.one, "一");
        map.put(Weekday.two, "二");

        System.out.println(map);
        System.out.println(map.get(Weekday.two));

    }

}

enum Weekday {
    one(1), two(2), three(3), four(4), five(5), six(6), sun(7);

    public final int day;

    Weekday(int day) {

        this.day = day;
    }
}

