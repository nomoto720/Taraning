public class Ex5_2{
	public static void main(String[] args){
		email("修正追加","tka303@gmail.com","ファイルを修正して追加しました。");
	}
	static void email(String title,String address,String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
}
