public class Lottery{
	public static void main(String[] args){
		int lot=0;
		int num=0;
		for(int i=0;i<3;i++){
		lot=new java.util.Random().nextInt(100)+1;
		System.out.printf("%d回目%n",i+1);
		System.out.println(lot);
		if(lot==1){
			num=num+10000000;
			System.out.println("1000万円");
		}else if(lot<4){
			num=num+1000000;
			System.out.println("100万円");
		}else if(lot<7){
			num=num+100000;
			System.out.println("10万円");
		}else if(lot<11){
			num=num+10000;
			System.out.println("1万円");
		}else if(lot<21){
			num=num+1000;
			System.out.println("1000円");
		}else if(lot<41){
			num=num+100;
			System.out.println("100円");
		}else{
			System.out.println("ハズレ");
		}
		}
		System.out.println("獲得賞金は");
		System.out.printf("%,d円でした！%n",num);
	}
}
