package com.bittech.fun;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
@FunctionalInterface
public interface MathAdd {
    
    //y = f(x)
    //3 = f(1,2)
    int add(int a, int b);
    
    public static void main(String[] args) {
        
        MathAdd f = (a, b) -> {
            return a + b;
        };
        int returnValue = f.add(1, 2);
        System.out.println(returnValue);
        
        
    }
}
