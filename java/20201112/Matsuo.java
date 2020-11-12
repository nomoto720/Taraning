import java.util.*;
public class Matsuo{
	public static void main(String[] args){
		System.out.print("何回サイコロを振る？");
		int num=new Scanner(System.in).nextInt();
		int[] dices=new int[num];
		for(int i=0;i<dices.length;i++){
			dices[i]=new Random().nextInt(6)+1;
		}
		for(int i=0;i<dices.length-1;i++){
			for(int j=i+1;j<dices.length;j++){
          if(dices[i]>dices[j]){
            int temp=dices[i];
            dices[i]=dices[j];
            dices[j]=temp;
					}
			}
		}
		System.out.println(Arrays.toString(dices));
	}
}
