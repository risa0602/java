import java.util.*;
public class Nenrei{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("何歳>>");
		//nextIntの次にnextLineをする際は1度nextLineで空読みしておく
		int age = sc.nextInt();sc.nextLine();
		System.out.println("名前>>");
		String name = sc.nextLine();
		System.out.printf("ようこそ%s(%d)!%n",name,age);
	}
}
