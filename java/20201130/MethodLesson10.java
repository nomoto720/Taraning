import java.util.*;
public class MethodLesson10{
	static int priceIncludir(int price,int tax){
			return price+price*tax/100;
			
	}
	public static void main(String[] args){
		System.out.print("消費税は何%ですか>");
		Scanner scan=new Scanner(System.in);
		int tax=scan.nextInt();
		int sumPrice=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int price=scan.nextInt();
			if(price==0){
				break;
			}
			sumPrice+=price;
		}
		System.out.printf("お買い物合計は%d円(税込み)です。%n",priceIncludir(sumPrice,tax));
	}
}
