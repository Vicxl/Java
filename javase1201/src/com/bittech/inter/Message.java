package com.bittech.inter;

/**
 * JDK8 新特性
 * Author: secondriver
 * Created: 2018/12/1
 */
public interface Message {
    
    //聊天功能
    void chat();
    
    //传输文件
    //default的普通方法
    default void transportFile() {
        System.out.println("暂未开放功能");
    }
    
    //静态方法
   static void info() {
        System.out.println("Message接口的静态方法");
    }
}
