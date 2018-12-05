package com.bittech.fun;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
@FunctionalInterface
public interface IUtil4 {
    
    Person create(String name, Integer age);
    
    public static void main(String[] args) {

//        Person person = new Person("jack",28);
        //方法引用结合函数编程使用
        IUtil4 iUtil = (name, age) -> {
            return new Person(name, age);
        };
        IUtil4 iUtil4 = Person::new;
        System.out.println(iUtil4.create("jack", 28));
        
        // y = f(x)  --> 函数编程
        // x = g(x)
        // y=f(g(x))
        //类，类的方法，对象，对象的方法，构造方法
        //方法引用: y=  f(x) = 类的方法，对象的方法，构造方法
        
    }
}

class Person {
    
    private String name;
    private Integer age;
    
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}