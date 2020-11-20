import java.util.*;
public class MethodLesson5{
	public static void main(String[] args){
		int n=sumOf(3,5,0);
		System.out.println(n);
		int n2=sumOf(4,6,4);
		System.out.println(n2);
	}
	//戻り値のあるメソッド
	static int sumOf(int a,int b, int c){
		return a+b+c;
	}
}
