import java.util.*;
public class UesgiSan{
	public static void main(String[] args){
		String[] when={"昔々","100年後","江戸時代","梅雨明け"};
		String[] who={"私が","隣人が","大統領が","犯人が"};
		String[] where={"アンデス山脈で","シルクロードで","体内で","火山で"};
		String[] what={"歩いた","寝た","生まれた","死んだ"};
		for(int i=0;i<4;i++){
			int index=new Random().nextInt(4);
			if(i==0){
				System.out.printf("%s",when[index]);
			}else if(i==1){
				System.out.printf("%s",who[index]);
			}else if(i==2){
				System.out.printf("%s",where[index]);
			}else{
				System.out.printf("%s",what[index]);
			}
		}
		System.out.println();
	}
}
