import java.util.*;
public class ExMethody{
	public static void main(String[] args){
		System.out.print("top>>");
		int top = new Scanner(System.in).nextInt();
		System.out.print("bottom>>");
		int bottom = new Scanner(System.in).nextInt();
		System.out.print("height>>");
		int height = new Scanner(System.in).nextInt();
		calcArea(top,bottom,height);
	}
	/*
	 * calcAreaメソッド
	 * topとbottomとheightを受け取り台形の面積を求める
	 * 引数:top(int),bottom(int),height(int)
	 */
	public static void calcArea(int top,int bottom,int height){
		System.out.printf("TOPが%d,BOTTOMが%d,HEIGHTが%dの台形の面積は%dです%n",top,bottom,height,(top+bottom)*height/2);
	}
}
