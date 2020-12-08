import java.util.*;
public class ArrayListLesson2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int addNum=sc.nextInt();
			if(addNum==0){
				break;
			}
			list.add(addNum);
		}
		System.out.println("――結果――");
		System.out.println("要素数:"+list.size());
		System.out.print("要素:");
		for(int i:list){
		System.out.print(i+",");
		}
		System.out.println();
	}
}
