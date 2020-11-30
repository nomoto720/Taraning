import java.util.Scanner;
public class MethodLesson9{
	static double calcBMI(double wightkg,double heightCm){
		double heightM=heightCm/100;
		double bmi=wightkg/(heightM*heightM);
		return bmi;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double wight=scan.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=scan.nextDouble();
		double bmi=calcBMI(wight,height);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。",wight,height,bmi);
		scan.close();
	}
}
