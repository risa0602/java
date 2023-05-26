import java.util.*;
public class ExSample{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("何人>>");
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0;i<data.length;i++){
			data[i] = rand.nextInt(100-0+1);
		}
		System.out.println(Arrays.toString(data));
	}
}
