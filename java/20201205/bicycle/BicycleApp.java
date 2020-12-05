import java.util.*;
public class BicycleApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Bicycle bicycle=new Bicycle(27);
		Bicycle eleBicycle=new ElectricBicycle(24,10);
		while(true){
			System.out.println("自転車を選んでください");
			System.out.println("0・・・自転車/ホイールサイズ:27");
			System.out.println("1・・・電動自転車/ホイールサイズ:24 バッテリー:10");
			System.out.println("2・・・終了");
			System.out.print("番号を入力してください>");
			int select=sc.nextInt();
			switch(select){
				case 0:
					while(true){
					System.out.print("1/走る,2/降りる>");
					int bicycSelect=sc.nextInt();
						if(bicycSelect==1){
							bicycle.ride();
						}else{
							bicycle.getOff();
							break;
						}
					}
					break;
				case 1:
					while(true){
						System.out.print("1/走る,2/降りる,3/充電>");
						int eleBicycSelect=sc.nextInt();
							if(eleBicycSelect==1){
								eleBicycle.ride();
							}else if(eleBicycSelect==2){
								eleBicycle.getOff();
								break;
							}else{
								((ElectricBicycle)eleBicycle).batteryCharge();
							}
					}
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
