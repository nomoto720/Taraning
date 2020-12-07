import java.util.*;
public class ArcherApp2{
	public static void main(String[] args){
		Archer[] a=new Archer[10];
		for(int i=0;i<10;i++){
			a[i]=new Archer(i+1);
			System.out.println("Archer"+Archer.getTotalArcher()+"を生成しました");
		}
		System.out.print("アーチャー番号を入力(1~10):");
		int num=new Scanner(System.in).nextInt();
		a[num-1].shootArrow();

	}
}
