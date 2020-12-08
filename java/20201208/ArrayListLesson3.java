import java.util.*;
public class ArrayListLesson3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Slime> slimes=new ArrayList<>();
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
				slimes.add(slime);
				slimes.instance(count);
				count++;
			}else{
					for(Slime s:slimes){
						s.attack();
					}
				return;
			}
		}
	}
}
