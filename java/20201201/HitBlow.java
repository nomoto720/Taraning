import java.util.*;
public class HitBlow{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("要素数(10以下):");
		int elementNum=scan.nextInt();
		HitBlowbed hitBlowbed=new HitBlowbed(elementNum);
		hitBlowbed.randomNum(elementNum);
		while(true){
		System.out.prinf("%dの数字を入力せよ>",elementNum);
		String inputNum=scan.nextLine();
		hitBlowbed.hitBlowNum(inputNum);
		}
	}


	class HitBlowbed{
		String correctNum;
		int elemntNum;
		int count;
	}
	public HitBlowbed(int elementNum){
		this.elementNum=elementNum;
	}
	public void randomNum(int elementNum){
		Random ram=new Random();
		String str="";
		for(int i=0;i<elementNum;i++){
			str=""+ram.netInt(10);
		}
		this.correctNum=str;
	}	
	public void hitBlowNum(String inputNum){
				int hit;
				int blow;
				count+=1;
		for(int i=0;i<this.elementNum;i++){
				int n=character.getNumericValue(inputNum.charAt(i));
				int c=character.getNumericValue(this.correctNum.charAt(i));
				if(n==c){
					hit+=1;
				}
		}
		for(int i=0;i<this.elementNum;i++){
				int n=character.getNumericValue(inputNum.charAt(i));
			for(int j=0;j<this.elementNum;j++){
				int c=character.getNumericValue(this.correctNum.charAt(j));
				if(i==j){
					continue;
				}else if(n==j){

				}else{
				}

			}
		}
		System.out.printf("Hit=%d/",hit);
		if(hit==4){
			System.out.plintln("Nice Hit!!");
			System.out.printf("正解=%s",this.correctNum);
			System.out.printf("Count:%d%n",this.count);
			return;
		}
	}
}
