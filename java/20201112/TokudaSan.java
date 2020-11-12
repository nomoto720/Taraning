import java.util.*;
public class TokudaSan{
	public static void main(String[] args){
		System.out.print("何人ですか>");
		int num=new Scanner(System.in).nextInt();
		int[] scores=new int[num];
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d人目の点数",i+1);
			scores[i]=new Scanner(System.in).nextInt();
		}
		System.out.println(Arrays.toString(scores));
	}
}
