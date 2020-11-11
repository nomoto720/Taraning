import java.util.*;
public class Arrays{
	public static void main(String[] args){
		int[] balls=new int[100];
		int scoreA=0;
		int scoreB=0;
		int ganar1=0;
		int ganar2=0;
		for(int i=0;i<balls.length;i++){
		balls[i]=i;
		}

		for(int i=0;i<5;i++){
			System.out.printf("%d回戦%n",i+1);

			for(int j=0;j<2;j++){
			int index = new Random().nextInt(balls.length-i-j);
			if(j==0){
				scoreA=index;
				System.out.printf("A:%d,",index);
			}else{
				scoreB=index;
				System.out.printf("B:%d...",index);
			}
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i-j];
			balls[balls.length-1-i-j]=temp;	
			}if(scoreA>scoreB){
				System.out.print("Aの勝ち");
				ganarA=ganarA+1;
			}else{
				System.out.print("Bの勝ち");
				ganarB=ganarB+1;
			}
			System.out.println();
		}
			String ganar=0;
			if(ganarA>ganar){
				ganar=("A");
			}else{
				ganar=("B");
			}
			System.out.printf("%d対%dで%dの勝ち&n",ganarA,ganarB,ganar);
	}
}
