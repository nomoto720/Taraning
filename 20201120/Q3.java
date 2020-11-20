import java.util.*;
public class Q3{
	public static void main(String[] args){
		System.out.println("****TriangleCalculator****");
			while(true){
				System.out.print("どうする？1...三角形の面積を求める 0...やめる>");
				int stopDo=new Scanner(System.in).nextInt();
				if(stopDo==1){
					System.out.print("底辺を入力してください>");
					double bottom=new Scanner(System.in).nextDouble();
					System.out.print("高さを入力してください>");
					double height=new Scanner(System.in).nextDouble();
					double area=triangle(bottom, height);
					System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです。%n",bottom,height,area);
				}else{
					System.out.println("アプリケーションを終了します。");
					break;
				}
			}
	}
	static double triangle(double bottom, double height){
		return bottom*height/2;
	}
}
