import java.lang.reflect.Method;
import java.util.List;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        // 通过反射获取字段
        Class<Person> p = Person.class;

        Method f = p.getMethod("getAge");

        int age = (int) f.invoke(new Person("hello", 12));
        System.out.println(age);

    }
}

