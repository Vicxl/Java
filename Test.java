abstract class Person{
	private String name;
	public Person(){//构造方法
		System.out.println("****");
	}
	public String getName(){//普通方法
		return this.name;
	}
	public void setName(){
		this.name = name;
	}
	//抽象方法，所有的抽象方法都不包含方法体
	public abstract void getPersonInfo();
}

class Student extends Person{//定义抽象类的子类
	public Student(){
		System.out.println("~~~~");
	}
	public void getPersonInfo(){
		System.out.println("我是学生");
	}
}

public class Test{
	public static void main(String[] args){
		//Person per = new Student();//实例化子类，向上转型
		//per.getPersonInfo();//被子类所覆写的抽象方法
		new Student();
	}
}