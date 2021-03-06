import java.util.*;
public class VendingMachineApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Wallet wallet=new Wallet(1000);
		VendingMachine vm=new VendingMachine(3);
		vm.insertMoneyDisplay();
		while(true){
			System.out.print("1.硬貨投入/2.商品購入/3.硬貨取出/4.商品投入/5.所持金表示/6.終了>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				System.out.print("投入する金額を入力してください");
				int coin=sc.nextInt();
				wallet.takeOutMoney(coin);
				vm.insertCoins(coin);
				vm.insertMoneyDisplay();
				break;
			case 2:
				coin=vm.purchase();
				if(coin !=-1){
					wallet.insertMoney(coin);
				}
				break;
			case 3:
				coin=vm.cancel();
				wallet.insertMoney(coin);
				break;
			case 4:
				System.out.print("投入する個数を入力してください>");
				int num=sc.nextInt();
				vm.insertGoods(num);	
				break;
			case 5:
				wallet.display();
				break;
			case 6:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
