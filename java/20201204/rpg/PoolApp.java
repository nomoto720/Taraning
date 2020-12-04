import java.util.*;
public class PoolApp{
	public static void main(String[] args){
			Pool pool=new Pool();
			Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("1.給水/2.排水/3.表示/4.終了>");
			int select=scan.nextInt();
			switch(select){
				case 1:
					double feed;
					do{
						System.out.print("給水する水量を入力してください>");
						feed=scan.nextDouble();
						if(feed<0){
							System.out.println("[給水量は正の値をいれてください。]");
						}
					}while(feed<0);
					pool.feedWater(feed);
					
					break;
				case 2:
					double drain;
					do{
						System.out.print("排水する水量を入力してください>");
						drain=scan.nextDouble();
						if(drain<0){
							System.out.println("[排水量は正の値をいれてください。]");
						}
					}while(drain<0);
					pool.drainWater(drain);
					break;
				case 3:
					pool.display();
					break;
				default:
					System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
