public class Test1{
	public static void code1(){
		char c = 'A';
		int a = c;
		a = a + 32;
		c = (char)a;
		System.out.println(c);
	}
	
	
	public static void code2(){
		int a = 1;
		int b = 1;
		System.out.println(a++);
		System.out.println(++b);
	}
	
	
	
	public static void main(String[] args){
		int i = 0;
		int j = 0;
		for(i = 1; i < 10; i++){
			for(j = 1; j <= i; j++){
				System.out.println(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println("\n");
		}
	}
	
}