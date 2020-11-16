import java.util.*;
public class HiroseSan{
	public static void main(String[] args){
		System.out.print("何回ひく?(1~10)>");
		int num=new Scanner(System.in).nextInt();
		int []numsA=new int[num];
		int []numsB=new int[num];
		int sumA=0;
		int sumB=0;
		for(int i=0;i<num;i++){
			for(int j=0;j<2;j++){
				int rum=new Random().nextInt(50)+1;
				if(j==0){
					numsA[i]=rum;
					sumA=sumA+numsA[i];
				}else{
					numsB[i]=rum;
					sumB=sumB+numsB[i];
				}
			}
			System.out.printf("%d回目Aさん:%d,Bさん:%d%n",i+1,numsA[i],numsB[i]);
		}
		System.out.printf("合計:Aさん:%d,Bさん:%d%n",sumA,sumB);
		if(sumA>sumB){
			System.out.println("Aさんの勝ち");
		}else if(sumA<sumB){
			System.out.println("Bさんの勝ち");
		}else{
			System.out.println("引き分け");
		}
		
	}
}
