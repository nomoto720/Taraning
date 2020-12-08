import java.util.*;
public class ArrayListLesson3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Slime> list=new ArrayList<>();
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listにスライムを追加していってみよう。");
		while(true){
			System.out.print("スライムを追加する？(1...yes,2...no):");
			int select=sc.nextInt();
			sc.nextLine();
			int count=0;
			if(select==1){
				System.out.print("スライムの名前を決めてね");
				String name=sc.nextLine();
				Slime slime=new Slime(name);
				slime.appear();	
				list.add(slime);
			}else{
					for(Slime s:list){
						s.attack();
					}
				return;
			}
		}
	}
}
