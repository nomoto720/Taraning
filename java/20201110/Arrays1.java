import java.util.*;
public class Arrays1{
	public static void main(String[] args){
	int [] sack=new int[99];
	int index=0;
	int indexA=0;	
	int indexB=0;
 	int ganarA=0;
	int ganarB=0;
	int temp=0;
		for(int i=0 ; i<sack.length; i++){
			sack[i]=i+1;
		} 
		for(int i=0 ;i<5; i++){
			System.out.printf("%d回戦%n",i+1);
			for(int j=0;j<2;j++){
				if(j==0){
					indexA=new Random().nextInt(sack.length-1-i*2)+1;
					System.out.printf("A:%d,",indexA);
					index=indexA;
				}else{
					indexB=new Random().nextInt(sack.length-1-i*2-j);
					System.out.printf("B:%d...",indexB);
					index=indexB;	
				}
			   	temp = sack[index];
                                sack[index] = sack[sack.length-(i*2)-j-1];
                                sack[sack.length-(i*2)-j-1] = temp;
			}	
			if(indexA > indexB){
				System.out.print("Aの勝ち");
				ganarA=ganarA+1;
			}else{
				System.out.print("Bの勝ち");
				ganarB=ganarB+1;
			}		
			System.out.println();		
			
		}
		if(ganarA > ganarB){
		System.out.printf("%d対%dでAの勝ち",ganarA,ganarB);
		}else{
		System.out.printf("%d対%dでBの勝ち",ganarA,ganarB);
		}
		System.out.println();
	}
}
