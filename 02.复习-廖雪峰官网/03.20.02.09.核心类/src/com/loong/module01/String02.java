package com.loong.module01;

import java.util.Arrays;

/*
    String 不可变类型

    Java字符串String是不可变对象；
        字符串操作不改变原字符串内容，而是返回新字符串；
        常用的字符串操作：提取子串、查找、替换、大小写转换等；
        Java使用Unicode编码表示String和char；
        转换编码就是将String和byte[]转换，需要指定编码；
        转换为byte[]时，始终优先考虑UTF-8编码。
 */
public class String02 {
    public static void main(String[] args) {
        int[] scores = new int[]{1, 2, 3};

        // Score score = new Score(scores.clone());
        Score score = new Score(scores);
        score.printScores();
        scores[2] = 4;
        System.out.println(Arrays.toString(scores));
        score.printScores();
    }

    static class Score {
        private int[] scores;

        Score(int[] scores) {
            // 等号赋值，赋值的就是引用
            // this.scores = scores;
            // 复制这个数组
            this.scores = Arrays.copyOf(scores, scores.length);
        }

        void printScores() {
            System.out.println(Arrays.toString(scores));
        }
    }
}


