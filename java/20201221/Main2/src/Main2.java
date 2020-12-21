import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("数値(1~10000)>");
		String num=sc.nextLine();
		sc.close();
		System.out.println("逆順にしました->");
		for(int i=num.length()-1;i>=0;i--) {
			System.out.print(num.charAt(i));
		}
	}
}
