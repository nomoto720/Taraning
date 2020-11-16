import java.util.*;
public class ArrLesson4{
	public static void main(String[] args){
		
		String [][] fourWs =new String[4][];
		String [] names={"いつ","誰が","どこで","何を"};
		for(int i=0;i<names.length;i++){
			System.out.printf("%sはいくつ>",names[i]);
			int num=new Scanner(System.in).nextInt();
			fourWs[i]=new String[num];
			for(int j=0;j<fourWs[i].length;j++){
				System.out.printf("%sをいれて>",names[i]);
				fourWs[i][j]=new Scanner(System.in).nextLine();
			}
		}
		for(int i=0;i<fourWs.length;i++){
			int rum=new Random().nextInt(fourWs[i].length);
			System.out.printf("%s",fourWs[i][rum]);
			if(i==1){
				System.out.print("が");
			}else if(i==2){
				System.out.print("で");
			}
		}
	}
}
