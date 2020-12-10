import java.util.*;
public class SetLesson2{
	public static void main(String[] args){
		String str="赤,青,黄,青,緑,緑,黒,白,青,ピンク,黄緑,白
";
		Set<String> colors=new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("青");
		colors.add("緑");
		colors.add("緑");
		colors.add("黒");
		colors.add("白");
		colors.add("青");
		colors.add("ピンク");
		colors.add("黄緑");
		colors.add("白");
		System.out.println("色は"+colors.size()+"種類です");
		if(colors.contains("黒")){
			System.out.println("黒は含まれています");
		}else{
			System.out.println("黒は含まれていません");
		}
	}
}
