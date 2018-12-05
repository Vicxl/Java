package com.xl001;

public class Test {

    //给结果添加异常
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            div(8, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
