public class Ex5_4{
	public static void main(String[] args){
		System.out.printf("三角形の面積は%.1f平方cm%n",calcTriangleArea(5.5,3.4));
		System.out.printf("円の面積は%.1f平方cm&n",calcCircleArea(5.0));
	}
	static double calcTriangleArea(double bottom,double height){
		return (bottom*height)/2;
	}
	static double calcCircleArea(double radius){
		return radius*radius*3.14;
	}
}
