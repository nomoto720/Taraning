import java.util.*;
public class Q2{
	public static void main(String[] args){
		int n=new Random().nextInt(10);
		System.out.printf("%dは%sです。%n",n,n%2==0?"偶数":"奇数");
	}
}
