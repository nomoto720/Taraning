import java.util.*;
public class ArrayListLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		//<>には参照型しかいれられない。
		//intを使いたいときはintegerを使う
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
		System.out.println(names.size()); //2
		names.add(0,"John");//先頭に挿入
		names.set(2,"Ringo");//指定indexを書き換え
		if(names.isEmpty()){
			System.out.println("要素はありません");//names.size()==0
		}
		if(names.contains("Paul")){
			System.out.println("paulを含みます");
		}
		System.out.println("Paluiのindexは"+names.indexOf("Paul"));
		names.clear();
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.get(1));
		for(int i:list){
			System.out.println(i);
		}
		list.add(2,40);
		System.out.println(list.get(2));
		List<String> list2 = Arrays.asList("ジョン","レオン","キャメロン","ジョナサン","カレン");
		for(String str:list2){
			System.out.println(str);
		}
		List<String> list3 =new ArrayList<>();
		list3=new LinkedList<>();




	}
	static void method(List<String> list){}
}
