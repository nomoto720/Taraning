import java.util.*;
public class OneWayLoveApp{
	public static void main(String[] args){
		System.out.print("名前を入力してください>");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		OneWayLove p1=new OneWayLove(name);
		System.out.print("好きな人の名前を入力してください");
		String name2=scan.nextLine();
		OneILove l1=new OneILove(name2);
		while(true){
			System.out.print("何をしますか?1...告白する、2...自分磨きをする、3、自分のステータスを見る、4、諦める");
			int num=scan.nextInt();
			if(num==1){
				p1.askLove(l1.name);
				l1.repConfession(p1.name,p1.weight,p1.sabing,p1.effort);
			}else if(num==2){
				p1.betterMyself();
			}else if(num==3){
				p1.myStatus();
			}else{
				System.out.println("失恋を認めました。ゲームを終了します");
				break;
			}
		}
		
	}	
}
