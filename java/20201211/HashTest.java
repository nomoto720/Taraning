import java.util.*;
public class HashTest{
	public static void main(String[] args){
		Map<String,Integer> prefs=new HashMap<>();
		prefs.put("京都",255);
		prefs.put("東京",1261);
		prefs.put("熊本",181);
		int tokyo=prefs.get("東京");	
		System.out.println("東京の人口は"+tokyo);
		prefs.remove("京都");
		prefs.put("熊本",182);
		int kumamoto=prefs.get("熊本");
		System.out.println("熊本県の人口は"+kumamoto);
		System.out.println("東京都の人口は"+prefs.get("東京"));
		for(String key: prefs.keySet()){
			System.out.println(key+"の人口は"+prefs.get(key));
		}
	}
}
