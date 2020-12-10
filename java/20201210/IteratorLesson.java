import java.util.*;
public class IteratorLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<String>();
		names.add("ﾐﾅﾄ");
		names.add("朝霞");
		names.add("菅原");
		
		Iterator<String> it=names.iterator();
		while(it.hasNext()){
			String e=it.next();
			System.out.println(e);
		}
	}
}
