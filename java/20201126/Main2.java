import my.util.*;
import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("配列の要素数を入力してください>");
		int count=new Scanner(System.in).nextInt();
		int min=-10;int max=10;
		System.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(Common.arrRandomRange(min,max,count)));
		int[] arrFormer=Common.arrClone(arrRandom);
		while(true){
		System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
		int num=new Scanner(System.in).nextInt();
			if(num==1){
				System.out.println(Arrays.toString(arrFormer));
			}else if(num==2){
				Common.arrSort(arrRandom);
				System.out.println(Arrays.toString(arrRandom));
			}else if(num==3){
				Common.arrSort(arrRandom,true);
				System.out.println(Arrays.toString(arrRandom));
			}else{
				System.out.println("アプリケーションを終了します");
				break;
			}

		}
	}
}
