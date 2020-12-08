import java.util.*;
public class ArrayListLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		names.add("Jhon");
		names.add("Paul");
		names.add("George");
		
		System.out.println(names.get(0));//John
		System.out.println(names.size());//3

		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
		for(String s:names){
			System.out.println(s);
		}
		names.remove(0);
		System.out.println(names.size());
	}
}
