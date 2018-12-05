package com.bittech.fun;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
@FunctionalInterface
public interface IUtil3 {
    
    //a > b return >0
    //a =b return 0
    //a < b  return <0
    Integer compare(Integer a, Integer b);
    
    public static void main(String[] args) {
        
        //方法引用-类中普通方法
        IUtil3 iUtil3 = Integer::compareTo;
        System.out.println(iUtil3.compare(1, 2));
        System.out.println(iUtil3.compare(2, 2));
        System.out.println(iUtil3.compare(3, 2));
        
    }
}
