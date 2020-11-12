import java.util.*;
public class Sac{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		int[] scores=new int[num];
		System.out.println();
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d人目の点数>",i+1);
			int score=new Scanner(System.in).nextInt();
			scores[i]=score;
		}
		System.out.println();
		System.out.println(Arrays.toString(scores));
	}
}
