import java.util.*;
public class BuildingApp{
	public static void main(String[] args){
		/*Scanner sc=new Scanner(System.in);
		List<Building> list=new ArrayList<>();
		for(int i=0;i<5;i++){
			System.out.print("建物の幅>");
			int width=sc.nextInt();
			Building building=new Building(width);
			list.add(building);
			building.display();
		}	
		Building.displayAll(list); */

		/*Scanner sc=new Scanner(System.in);
		System.out.print("建物の幅>");
		int width=sc.nextInt();
		Building b1=new Building(width);
		b1.display();*/

		
		Building b1=new Building(12);
		Building b2=new Building(10);
		Building b3=new Building(7);
		Building b4=new Building(15);
		Building b5=new Building(7);
		List<Building> list=new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		Building.displayAll(list);
		
	}
}
