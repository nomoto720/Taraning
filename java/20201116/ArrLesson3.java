import java.util.*;
public class ArrLesson3{
	public static void main(String[] args){
		System.out.print("何クラス>");
		int classNum=new Scanner(System.in).nextInt();
		int[][] data = new int[classNum][];
		for(int i=0 ; i<data.length ; i++){
			System.out.printf("クラス%dは何人>",i+1);
		  int studentNum=new Scanner(System.in).nextInt();
			data[i]=new int[studentNum];
			for(int j=0; j<data[i].length; j++){
				System.out.printf("%d人目の点数>",j+1);
				data[i][j] = new Scanner(System.in).nextInt();
			}
		}
		for(int i=0;i<6;i++){
			System.out.print("-");
			if(i==2){
				System.out.print("結果");
			}
		}
    System.out.println();
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%4d",data[i][j]);
			}
			System.out.println();
		}
	}
}
