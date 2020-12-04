import java.util.*;
public class SplitLesson{
	public static void main(String[] args){
		String str="りんごとみかんとばななとと";//CSVデータ
		String[] data=str.split("と",-1);
		System.out.println(Arrays.toString(data));
	}
}
