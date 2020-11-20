import java.util.*;
public class Q1{
	public static void main(String[] args){
		System.out.print("繰り返す文字>");
		String str=new Scanner(System.in).next();
		System.out.print("繰り返す回数");
		int num =new Scanner(System.in).nextInt();
		repe(str,num);
		System.out.println(repe(str,num));
	}
	static String repe(String str,int num){
		String sum="";
		for(int i=0;i<num;i++){
			sum=sum+str;	
		}
		return sum;
	}
}
