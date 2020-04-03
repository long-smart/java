public class Main {
    public static void main(String[] args) {
        // <? extends Number> 表示类型解释是 Number及其子类
        // 获取字段可以用 Number来接收数据
        // 设置字段就不可以
        // <? extends Number> 使用extends通配符表示可以读，不能写。
        Pair<? extends Number> pair = new Pair<>(1, 123.123);

//        pair.setFirst();
        System.out.println(pair.getFirst());
        System.out.println(pair.getLast());


        Pair<? super Integer> pair1 = new Pair<>(1, 2);
    }
}
