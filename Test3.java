public class Test3{
	public static int fac(int num){
		//抛出异常
		if(num < 0){
			return -1;
		}
		if(num==0 || num==1){
			return 1;
		}else{
			return num*fac(num - 1);
		}
	}
	
	public static void main(String[] args){
		int result = fac(10);
		System.out.println("10!="+result);
	}
}