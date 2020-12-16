import java.util.*;
public class Test2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input;
		String answer="Integer.parseInt(str)";
		String answer2="Integer.valueOf(str)";
		System.out.print("Q1.String str=\"123\"をint型に変換せよ ");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)||answer2.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		answer="String.valueOf(num)";
		System.out.print("Q2.int num=123をString型に変換せよ ");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
	}
}
