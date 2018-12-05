package com.bittech.fun;

/**
 * 1. 接口只有一个抽象方法，支持函数式编程
 * 2. lambda表达式写法: (参数列表) -> { 方法体 };
 * <p>
 * Author: secondriver
 * Created: 2018/12/1
 */
public class TestMessage {
    
    //匿名内部类实例化对象的方式
    public static void code1() {
        Message message = new Message() {
            @Override
            public void print() {
                System.out.println("Message print");
            }
        };
        message.print();
    }
    
    public static void main(String[] args) {
        Message message = () -> {
            System.out.println("Message print1");
            System.out.println("Message print2");
        };
        message.print();
        
        Message2 message2 = (message1) -> {
            System.out.println(message1);
            System.out.println(message1 + "...");
        };
        message2.print("Hello world");
        
        Message3 message3 = (message1, sub) -> {
            System.out.println(message1 + sub);
        };
        message3.print("hello", ".java");
        
        //return 只有一条语句
        Message4 message4 = (message1, sub) -> {
            return message1 + sub;
        };
        System.out.println(message4.print("hello", " java "));
        
    }
}
