import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class List01 {
    public static void main(String[] args) {
        // List.off返回的数组只读
        List<String> list = List.of("1", "2", "3");

        String[] arr = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }
}
