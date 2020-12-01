import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("花の色は何色にしますか?>");
		String color=scan.nextLine();
		System.out.print("種をいくつ植えますか?>");
		int seedNum=scan.nextInt();
		Flowerbed flower=new Flowerbed(color,seedNum);
		while(true){
			System.out.print("何をしますか？1...水汲み2...水撒き3...花壇を見る4...終了>");
			int num=scan.nextInt();
			if(num==1){
				flower.drawWater();
			}else if(num==2){
				flower.waterFlower();
			}else if(num==3){
				flower.showStatus();
			}else{
				System.out.println("アプリケーションを終了します");
				break;
			}
		}
	}
}
