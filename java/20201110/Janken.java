public class Janken{
	public static void main(String[] args){
		System.out.print("手を入力0.グー、1.チョキ,2.パー>");
		int num=new java.util.Scanner(System.in).nextInt();
		String[] janken={"グー","チョキ","パー"};
		int num2=new java.util.Random().nextInt(janken.length);
		System.out.printf("PCは%dです",janken[num2]);
		
		if(num==num2){
			System.out.println("あいこです");
		}else if(num==0&&num2==1||num==1&&num2=2||num==2&&num2==0){
			System.out.println("あなたの勝ちです！");
		}else{
			System.out.println("あなたの負けです");
		}
		}	
}
