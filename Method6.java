import java.util.*;
public class Method6{
	public static void main(String[] args){
		int ret = method(3);
		System.out.println(ret);
		ret = method(-5);
		System.out.println(ret);
		System.out.println(method1(2,5,3));//5
		System.out.println(method2(1.0,2.0,3.0));//2.0
		System.out.println(method3("Hello","World"));//2.0
		System.out.println(method4(10));//true
		if(method4(10)){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
		int[] arr ={1,2,3};
		method5(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = {10,20,30};
		int[] retArr = method6(arr2);
		System.out.println(Arrays.toString(retArr));
	}
	public static int method(int n){
		return -n;
	}
	public static int method1(int n1,int n2,int n3){
		int max = n1;
			if(n2 > max){
				max = n2;
			}
			if(n3 > max){
				max = n3;
			}
			return max;
	}
	public static double method2(double n1, double n2, double n3){
		return (n1 + n2 + n3) / 3;
	}
	public static String method3(String s1,String s2){
		return  s1+s2;
	}
	public static boolean method4(int n){
		/*
		boolean isEven;
		if(n % 2 == 0){
			isEven = true;
		}else{
			isEven = false;
		}
		return isEven;
		*/
		return n %2 == 0;
	}
	public static void method5(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]*2;
		}
	}
	public static int[] method6(int[] arr){
		int[] retArr = new int[arr.length];
		for(int i=0;i<retArr.length;i++){
			retArr[i] = arr[i]*2;
		}
		return retArr;
	}
}
