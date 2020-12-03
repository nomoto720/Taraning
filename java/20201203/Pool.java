public class Pool{
		final double MAX=600.0;
		double water;
		public Pool(){
			this.water=0.0;
		}
		public void feedWater(double water){
			double feed= water+this.water > this.MAX ? this.MAX-this.water : water;  
			this.water+=feed;
			System.out.printf("%.1f立方メートル給水しました。%n",feed);
		}
		public void drainWater(double water){
			double drain= water>this.water?this.water:water;
			this.water=this.water-drain;
			System.out.printf("%.1f立方メートル排水しました%n",drain);
		}
		public void display(){
			System.out.printf("現在の水量は%.1f立方メートルです。%n",this.water);
		}
}
