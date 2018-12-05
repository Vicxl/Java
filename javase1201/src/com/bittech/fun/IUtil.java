package com.bittech.fun;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
@FunctionalInterface
public interface IUtil {
    
    String convert(int value);
    
    public static void main(String[] args) {
        
        //方法引用：类的静态方法引用
        IUtil iUtil = String::valueOf;
        
        System.out.println(iUtil.convert(1));
        System.out.println(iUtil.convert(2));
        
        
    }
}
