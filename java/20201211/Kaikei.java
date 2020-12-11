import java.io.*;
import java.util.*;
public class Kaikei{
	public static void main(String[] args)throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		System.out.println("csvﾃﾞｰﾀ");
		System.out.println("------");
		String line;
		Map<String,Map<String,Integer>>lines=new HashMap<>();
		Map<String,Integer>list=new HashMap<>();
		while((line=br.readLine())!=null){
			System.out.println(line);
			string str=line;
			string[] strs=str.split(",");
			int money=Integer.valueOf(strs[2]);

			lines.put(strs[0],(stars,[1],money));
		}
		br.close();
	}
}

