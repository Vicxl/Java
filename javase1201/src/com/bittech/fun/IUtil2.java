package com.bittech.fun;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
@FunctionalInterface
public interface IUtil2 {
    
    String convert();
    
    public static void main(String[] args) {
        
        //方法引用-对象方法
        IUtil2 iUtil2 = "Hello"::toUpperCase;
        System.out.println(iUtil2.convert());
        
    }
}
