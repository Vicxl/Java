//Java数组章节练习题

 public class ArrayUtils{

    // //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
       
		 int MaxElement = data[0];
		 for(int i=0; i<data.length; i++){
			 if(data[i] > MaxElement){
				 MaxElement = data[i];
			 }
		 }
		System.out.println("最大值为："+MaxElement);
        return MaxElement;
    }
    
    // //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
 
		int MinElement = data[0];
		for(int i=0; i<data.length; i++){
			if(data[i] < MinElement){
				MinElement = data[i];
			}
		}
		System.out.println("最小值为："+MinElement);
        return MinElement;
    }
    
    
    // //3.计算数组值之和
    public static int arrayElementSum(int[] data){
 
		int sum = 0;
		for(int i=0; i<data.length; i++){
			sum = sum + data[i];
		}
		System.out.println("数组值之和为："+sum);
		
        return sum;
    }
    
    // //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
     
		int[] c = new int[a.length + b.length];
		for(int i=0; i<a.length; i++){
			c[i] = a[i];
		}
		for(int j=a.length; j<c.length; j++){
			c[j] = b[j-a.length];
		}
		
		System.out.println("a：");
		printArray(a);
	    System.out.println();
		System.out.println("b：");
	    printArray(b);
		System.out.println();
		System.out.println("c：");
		printArray(c);
		
        return c;
    }

    // //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
    
		int[] sub = new int[end - start];
 		System.arraycopy(data, start, sub, 0, sub.length);  //类方法、静态方法
		
		printArray(sub);
        return sub;
    }
    
    // //6.数组打印
    public static void printArray(int[] data){
		
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+" ");
		}
		
    }
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
     
		System.out.println("原数组:");
		printArray(data);
		System.out.println();
		
		int count = data.length;
		for(int i=0; i< count/2; i++){
			int temp = data[i];
			data[i] = data[count - i - 1];
			data[count - i - 1] = temp;
		}
		
		//System.out.println("数组元素个数为"+count);
		System.out.println("反转数组：");
		printArray(data);
    }
    
	
    public static void main(String[] args){
       
		int[] data = {1, 3, 4, 6, 9, 8, 7};
		System.out.println("data数组内容为：");
		
		printArray(data);
		System.out.println();
		
		arrayMaxElement(data);
		System.out.println();
		
		arrayMinElement(data);
		System.out.println();
		
		arrayElementSum(data);
		System.out.println();
		
		System.out.println("a,b数组的拼接：");
	    int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		arrayJoin(a, b);
		System.out.println();
		
		System.out.println("截取数组为：");
		arraySub(data, 1, 4);
		System.out.println();
		
		printReversal(data);
		System.out.println();
    }
}