import java.util.*;
public class PencilApp{
	public static void main(String[] args){
		System.out.print("何色の鉛筆を作りますか>:");
		Scanner scan=new Scanner(System.in);
		String color=scan.nextLine();
		Pencil pen1=new Pencil(color);
		while(true){
			System.out.print("操作を入力してください1...書く,2...情報を見る,3...終了>");
			int num=scan.nextInt();
			if(num==1){
				pen1.kaku();
			}else if(num==2){
				pen1.joho();
			}else{
				break;
			}
		}
		System.out.println("アプリケーションを終了します。");
	}
}
