public class InterfaceApplicationTest(){
	public static void main(String[] args){
		Computer computer = new Computer;
		UDisk udisk = new UDisk;
		computer.plugin();

}
interface USB {
    public void setup();
	// 安装USB驱动
    public void work();
	// 进行工作 
}

class Computer{
	public void plugin(Usb usb){
		usb.setup();
		usb.work();
	}
}

class UDisk implements Usb(){
	void setup(){
		System.out.println("安装鼠标驱动");
	}
	void work(){
		System.out.println("鼠标开始工作");
	}
}
 
