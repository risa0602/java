import java.util.*;
import my.util.*;
public class Commontest{
	public static void main(String[] args){
		int dice=Common.randRange(1,6);
		System.out.println(dice);
		int n = Common.intInput("要素数>>");
		int[] deta = new int[n];
		for(int i=0;i<deta.length;i++){
			deta[i]=Common.randRange(0,100);
		}
		Arrays.sort(deta);
		Common.arrReverse(deta);
		System.out.println(Arrays.toString(deta));
	}
}
