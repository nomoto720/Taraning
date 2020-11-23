import java.util.*;
public class Q4{
	public static void main(String[] args){
			System.out.println("名前を入力してください>");
			String name=new Scanner(System.in).nextLine();
			while(true){
				System.out.println("なにがしたいですか?");
				System.out.printf("0...文字数を確認する%n1...占いをする%n2...終了する>%n");
				int doing=new Scanner(System.in).nextInt();
				if(doing==0){
					System.out.printf("%sさんの文字数は%sです。%n",name,nameCount(name));
				}else if(doing==1){
					System.out.printf("%sさんの今日の運勢は%sです。%n",name,nameFortune());
				}else{
					System.out.println("終了します。");
					break;
				}
		}
	}
	static int nameCount(String name){
		return name.length();
	}
	static String nameFortune(){
		int luckyNum=new Random().nextInt(4)+1;
		switch(luckyNum){
			case 1:
			return "大吉";
			case 2:
			return "吉";
			case 3:
			return "小吉";
			case 4:
			return "凶";
		}
		return "吉" ;
	}	
}
