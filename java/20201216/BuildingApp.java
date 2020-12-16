import java.util.*;
public class BuildingApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("建物の幅>");
		int width=sc.nextInt();
		Building b1=new Building(width);
		b1.display();
	}
}
