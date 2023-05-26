public class Ex5_2{
	public static void main(String[] args){
		email("test","sample@gmail.com","sample");
		email("sample@gmail.com","sample");
	}
	public static void email(String title,String address,String text){
		System.out.printf("%sに、以下のメールを送信しました%n",address);
		System.out.printf("件名:%s%n",title);
		System.out.printf("本文:%s%n",text);
	}
	public static void email(String address,String text){
		email("無題",address,text);
	}
}
