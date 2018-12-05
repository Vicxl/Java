public class MulitiplicationTable{
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