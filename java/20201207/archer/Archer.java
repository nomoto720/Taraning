public class Archer{
	private static int totalArcher;
	private int no;
	public Archer(int no){
		this.no=no;
		totalArcher++;
	}
	public static int getTotalArcher(){
		return totalArcher;
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"は矢を放った！");
	}
}
