import java.util.Arrays;
public class Ram{
	public static void main(String[] args){
		int[] dice=new int[10];
		for(int i=0;i<dice.length;i++){
			int index=new java.util.Random().nextInt(6)+1;
			dice[i]=index;
		}
		System.out.println(Arrays.toString(dice));
	}
}
