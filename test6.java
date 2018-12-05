//模板设计模式代码结构
abstract class TemplateAbatractClass(){
	//模板方法,定义算法
	//被final声明以免子类改变算法的顺序
	public final templateMethod(){
		//按照定义提供算法，执行程序，可以采用一些流程控制
	}
	//具体操作延迟到子类是实现
	abstract void primitveOperation1();
	abstract void primitveOperation2();
	//具体操作且共用的方法定义在超类中
	//可以被模板方法或子类直接使用
	final void concreterOperation(){
		//实现
	}
	//可包含钩子方法
	//对于钩子方法，子类可以视情况决定要不要覆盖他们
	void hook(){
		//钩子方法
	}
}