public class Ex5_3{
	public static void main(String[] args){
		email("tka303@gmail.com","ファイルを修正して追加しました。");
	}
	static void email(String title,String address,String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
	static void email(String address,String text){
		System.out.printf("%sに、以下のメールを送信しました%n",address);
		System.out.println("件名:無題");
		System.out.printf("本文:%s%n",text);
	}
}
