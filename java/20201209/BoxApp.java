import java.util.*;
public class BoxApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Box[] boxs=new Box[2];
		Box box1=new Box("赤","円形",1);
		boxs[0]=box1;
		Box box2=new Box("青","四角",2);
		boxs[1]=box2;
	while(true){
		System.out.print("1.ボール投入/2.ボール取出/3.ボール総数表示/4.終了>");
		int select=sc.nextInt();
		switch(select){
			case 1:
				for(int i=0;i<boxs.length;i++){
					System.out.print(i+"---");
					boxs[i].displayInfo();
				}
				System.out.print("ボールを投入する箱の番号を入力してください>");
				int boxNumber=sc.nextInt();
				if(boxNumber>=2){
					System.out.println("箱の番号の入力が誤っています");
					continue;
				}
				System.out.print("投入するボールの個数を入力してください>");
				int insertBall=sc.nextInt();
				boxs[boxNumber].insertBalls(insertBall);
				break;
			case 2:
				for(int i=0;i<boxs.length;i++){
					System.out.print(i+"---");
					boxs[i].displayInfo();
				}
				System.out.print("ボールを取り出す箱の番号を入力してください>");
				int removeNumber=sc.nextInt();
				if(removeNumber>=2){
					System.out.println("箱の番号の入力が誤っています");
					continue;
				}
				System.out.print("取り出すボールの個数を入力してください>");
				int removeBall=sc.nextInt();
				boxs[removeNumber].removeBalls(removeBall);
				break;
			case 3:
				Box.displayTotalNumber();
				break;
			case 4:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
