import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> points=new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);
		int removed=points.set(3,50);
		System.out.println("removedは"+removed);
		System.out.println(points.get(1));
		for(int i:points){
			System.out.println(i);
		}
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		Integer i1=Integer.valueOf(16);
		int i2=i1.intValue();
		System.out.println(i1+i2);

		String s1=String.valueOf(16);
		int i3=Integer.parseInt(s1);
		System.out.println(s1+i3);
	}
}
