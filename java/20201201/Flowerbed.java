import java.util.*;
public class Flowerbed{
	final int MAXWATER=3;
	String color;
	int seedNum;
	int bloom;
	int water;
	public Flowerbed(String color,int seedNum){
		this.color=color;
		this.seedNum=seedNum;
	}
	public void drawWater(){
		if(this.water==this.MAXWATER){
			System.out.println("水は満杯です！");
		}else{
			this.water=this.MAXWATER-this.water;
			System.out.printf("水を%d汲みました。%n",this.water);
			this.water=this.MAXWATER;
		}
	}
	public void waterFlower(){
		if(this.bloom==this.seedNum){
			System.out.println("全ての花が咲いています！");
		}else if(this.water==0){
			System.out.println("水が空っぽです。");
		}else{
			this.water-=1;
			this.bloom+=1;
			System.out.println("水を撒きました。");
		}
	}
	public void showStatus(){
		System.out.printf("花の色は%s%n",this.color);
		System.out.print("#");
		for(int i=0;i<this.seedNum;i++){
			if(i<this.bloom){
				System.out.print("*");
			}else{
			System.out.print(".");
			}
		}
		System.out.println("#");
	}
}
