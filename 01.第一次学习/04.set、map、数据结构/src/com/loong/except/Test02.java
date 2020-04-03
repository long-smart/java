package com.loong.except;

public class Test02 {
    private static String[] names = {"long", "user1"};


    public static void main(String[] args) {
        try {
            boolean b = checkUserName("user1");
            System.out.println("成功");
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkUserName(String username) throws RegisterException {
        for (String name : names) {
            if (name.equals(username)) {
                throw new RegisterException(name + "已经有了");
            }
        }

        return true;
    }
}
