public class Person{
	//属性
	//引用数据类型在类中作为属性时，创建对象是，默认值为NULL
	String name;
	String gender;
	Double faceScore;
	
	void eat(){//类里的一个行为
		System.out.println("name+ 吃");
	}
	
	void study(){
		System.out.println("name+ 学");
	}
	
	void play(){
		System.out.println("name+ 玩");
	}
	
	public static void main(String[] args){
		Person person1 = new Person();
		person1.name = "张三";
		person1.gender = "男";
		person1.faceScore = 9；
		
		person1.eat();
		
		Person person2 = new Person();
		person1.name = "李四";
		person1.gender = "女";
		person1.faceScore = 8；
		
		perdon2.eat();
	}
}