public class Code4_1{
	public static void main(String[] args){
		int [] subs={20,30,40,50,80,100,20};
		int sum=0;
		for(int n:subs){
			sum+=n;
		}
		int avg=sum/subs.length;
		System.out.printf("合計点:%d%n",sum);
		System.out.printf("平均点:%d%n",avg);
	}
}
