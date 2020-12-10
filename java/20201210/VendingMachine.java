public class VendingMachine{
	private int money;
	private int num;
	public VendingMachine(int n){
		this.num=n;
		this.money=0;
	}
	public void insertCoins(int coin){
		this.money+=coin;
	}
	public int cancel(){
		return this.money;
	}
	public void purchase(){
		if(this.money>=100 && this.num>0){
			this.num-=1;
			this.money-=100;
			return cancel();
		}else if(this.money<100){
			System.out.println("投入金額が足りません");
			return -1;
		}else{
			System.out.println("商品売り切れ");
			return -1;
		}
	}
	public void insertGoods(int num){
		this.num+=num;
	}
	public void insertMoneyDisplay(){
		System.out.println("現在の入金額:"+this.money+"円");
	}
}
