public class Wallet{
	private int money;
	public Wallet(int money){
		this.money=0<money? money:0;
	}
	public void insertMoney(int inMoney){
		this.money+=inMoney;
		System.out.println("財布に"+inMoney+"円入れました");
	}
	public void takeOutMoney(int num){
		int outMoney=this.money<num ? this.money : num;
		this.money-=outMoney;
		System.out.println("財布から"+outMoney+"円取り出しました");
	}
	public void display(){
		System.out.println("現在の財布の中身："+this.money+"円");
	}
}
