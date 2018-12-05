public class Test4{
	public static void code1(){
	//数组声明及开辟空间
	int[] x = new int[3];
	for
	System.out.println(x);
	}
	
	public static void printArray(int[] a){
		for(i=)
	}
	
	public static void intArraySort(int[] a){
		Arrays.sort(a);
	}
	
	public static int[] arrayCopy(int[] a){
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
		}
		
		//Java系统下的系统拷贝  
		//效率高  
		System.arrayCopy(a, 0, b, 0, a.length );//开始位置  目标数组的位置
		
		//更好的使用  不用考虑数组是怎样构建的
		int[] b = Array.copyOf(a, 0);
		return b;
	}
	//返回值[0]最大值、[1]最小值、[2]平均值、[3]综合
	public static void statics(int[] a){
		int max = //最大放最小值
		int min = //最小放最大值
		int avg = 0;
		int sum = 0;
		for(i=0; i<a.length; i++){
			int value = a[i];
			if(value > max){
				max = value;
			}
			
			if(value < min){
				min = value;
			}
			
		}
	}
	
	public static void main(String[] args){
		int[] a = {23, 43, 2, 3};
		printArray(a);
		intArraySort(a);
		printArray(a);
	} 
}