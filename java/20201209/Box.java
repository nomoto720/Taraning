public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	public Box(String color,String shape,int num){
		this.color=color;
		this.shape=shape;
		this.num=num;
		this.totalNumber+=num;
	}
	public void insertBalls(int numBall){
		this.num+=numBall;
		System.out.println(numBall+"個のボールを入れました");
		this.totalNumber+=numBall;
	}
		public void removeBalls(int takeBall){
			int takeBallnum=0;
			if(this.num<takeBall){
				takeBallnum=this.num;
				totalNumber-=takeBallnum;
				this.num=0;
			}
			else{
				takeBallnum=takeBall;
				totalNumber-=takeBall;
				this.num=this.num-takeBall;
			}
			System.out.println(takeBallnum+"個のボールを取り出しました。");
		}
		public void displayInfo(){
			System.out.println("色:"+this.color+",形:"+this.shape+",個数:"+this.num);
		}
		public static void displayTotalNumber(){
			System.out.println("ボールの合計は"+totalNumber+"個です。");	
		}
}
