import java.util.*;
public class Sanpul{
	public static void main(String[] args){
		int n = new Random().nextInt(10)+1;
		Random rand = new Random();
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++){
			//nums[i] = new Random.nextInt(10)+1
			nums[i] = new rand.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(nums));
		Scanner scan = new Scanner(System.in);
		System.out.print("数値>>");
		int x = scan.nextInt();
	}
}
