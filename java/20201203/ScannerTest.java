import java.util.*;
public class ScannerTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("好きな数字は>");
		int likeNum1=sc.nextInt();
		int likeNum2=sc.nextInt();
		int likeNum3=sc.nextInt();
		System.out.println("likeNum1:"+likeNum1);
		System.out.println("likeNum2:"+likeNum2);
		System.out.println("likeNum3:"+likeNum3);

		sc.nextLine();
		System.out.print("お名前>");
		String name=sc.nextLine();
		System.out.printf("%sさんの好きな数字は%dですね%n",name,likeNum1);
		
	}
}
