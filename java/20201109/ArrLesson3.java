import java.util.Arrays;
public class ArrLesson3{
	public static void main(String[] args){	
	int[] dataA={3,5,10};
	int[] dataB=new int[]{4,6,10};
	String[] strs={"hoge","fuga","bar"};
	double[] nums={1.1,2.2,3.3};
	boolean[] bools={false,false,true,true,};
	for(int i =0;i<dataA.length; i++){
		System.out.println(dataA[i]);
	}
	for(int n: dataB){
		System.out.println(n);
	}
	for(int j =0;j<strs.length;j++){
		System.out.println(strs[j]);
	}
	for(String s : strs){
		System.out.println(s);
	}
	

	System.out.println(Arrays.toString(dataA));
	}
}
