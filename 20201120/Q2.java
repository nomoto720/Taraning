import java.util.*;
public class Q2{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double wKg=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double hCm=new Scanner(System.in).nextDouble();
		double bmi=calcBMI(wKg, hCm);
		System.out.printf("体重:%f kg,身長:%f cmのBMIは%.1fです。%n",wKg,hCm,bmi);
	}
	static double calcBMI(double wKg, double hCm){
		return	wKg /	((hCm/100)*(hCm/100));
	}
}
