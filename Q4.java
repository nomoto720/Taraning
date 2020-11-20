import java.util.*;
public class Q4{
	public static void main(String[] args){
			System.out.println("名前を入力してください>");
			String name=new Scanner(System.in).nextLine();
			while(true){
				System.out.println("なにがしたいですか?");
				System.out.print("0...文字数を確認する 1...姓名占いをする2...終了する>");
				int doing=new Scanner(System.in).nextInt();
				if(doing==0){
					System.out.printf("%sさんの文字数は%sです。%n",name,nameCount(name));
				}else if(doing==1){
				}else{
					System.out.println("終了します。");
					break;
				}
		}
	}
	static String nameCount(String name);
		return name.lenght();
}
