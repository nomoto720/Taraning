import java.util.*;
public class Arr3{
	public static void main(String[] args){
		int[] index=new int[100];
		int seven=-1;/*0だとfor文の最初とかぶってしまう*/
		for(int i=0;i<index.length;i++){
			index[i]=new Random().nextInt(index.length);
			System.out.print(index[i]+",");
		}
		System.out.println();
		for(int i=0;i<index.length;i++){
			if(77==index[i]){
				seven=i;
				System.out.printf("最初の77のindexは%dでした。%n",seven);
				break;	
			}
		}
		if(seven==-1){
			System.out.println("77はありませんでした。");
		}
		System.out.println();
	}
}
