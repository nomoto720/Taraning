import java.util.*;
public class MethodLesson2{
	public static void main(String[] args){
		System.out.print("整数を入力>");
		int num=new Scanner(System.in).nextInt();
		evenOdd(num);
	}
	static void evenOdd(int n){
			System.out.printf("%dは%sです%n",n,n%2==0? "偶数":"奇数");
	}
}
