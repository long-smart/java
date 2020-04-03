import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        /*
            TreeMap实现于SortedMap, 会保证已key的出现顺序来进行排序

         */
        Map<String, Integer> map = new java.util.TreeMap<>();
        map.put("1", 1);
        map.put("2", 2);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
