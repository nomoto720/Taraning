import java.util.*;
public class HitBlow{
	public static void main(String[] args){
		HitBlowbed hitBlowbed=new HitBlowbed();
		Scanner scan=new Scanner(System.in);
		System.out.print("要素数(10以下):");
		hitBlowbed.elementNum=scan.nextInt();
		hitBlowbed.randomNum(hitBlowbed.elementNum);
		//System.out.println(hitBlowbed.correctNum);
		String str=scan.nextLine();
		while(true){
			System.out.printf("%d桁の数字を入力せよ>",hitBlowbed.elementNum);
			String inputNum=scan.nextLine();
			hitBlowbed.hitBlowNum(inputNum);
			if(hitBlowbed.hit==4){
				return;
			}		
		}
	}
}
class HitBlowbed{
		String correctNum;
		int elementNum;
		int count;
		int hit;
	public void randomNum(int elementNum){
		Random ram=new Random();
		String str="";
		for(int i=0;i<elementNum;i++){
			str+=""+ram.nextInt(10);
		}
		this.correctNum=str;
	}	
	public void hitBlowNum(String inputNum){
				this.hit=0;
				int blow=0;
				boolean[] hitNum=new boolean[this.elementNum];
				count+=1;
		for(int i=0;i<inputNum.length();i++){
				int n=Character.getNumericValue(inputNum.charAt(i));
				int c=Character.getNumericValue(this.correctNum.charAt(i));
				if(n==c){
					this.hit+=1;
					hitNum[i]=true;
				}
		}
		for(int i=0;i<inputNum.length();i++){
				int n=Character.getNumericValue(inputNum.charAt(i));
			for(int j=0;j<this.elementNum;j++){
				int c=Character.getNumericValue(this.correctNum.charAt(j));
				if(i==j || hitNum[i]==true || hitNum[j]==true ){
					continue;
				}else if(n==c){
					blow+=1;
				}

			}
		}
		System.out.printf("Hit=%d/Blow=%d%n",hit,blow);
		if(this.hit==4){
			System.out.println("Nice Hit!!");
			System.out.printf("正解=%s%n",this.correctNum);
			System.out.printf("Count:%d%n",this.count);
		}
	}
}
