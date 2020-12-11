import java.io.*;
import java.util.*;
public class Acct{
	public static void main(String[] args)throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		System.out.println("csvﾃﾞｰﾀ");
		System.out.println("——————");
		String line;
		Map<String,Integer> personalAcct= new HashMap<>();
		Map<String,Integer> campAcct=new HashMap<>();
		while((line=br.readLine())!=null){
			System.out.println(line);
			String[] data=line.split(",");
			int acct=Integer.valueOf(data[2]);

			int persAcct=personalAcct.containsKey(data[0])?personalAcct.get(data[0])+acct:acct;
			personalAcct.put(data[0],persAcct);

			acct=campAcct.containsKey(data[1])?campAcct.get(data[1])+acct:acct;
			campAcct.put(data[1],acct);
		}
		br.close();
		System.out.println();
		System.out.println("キャンプ会計");
		System.out.println("——————");
		int campTotal=0;
		for(String key:campAcct.keySet()){
			System.out.println(key+":"+campAcct.get(key));
			campTotal+=campAcct.get(key);
		}
		System.out.println("——————");
		System.out.println("合計:"+campTotal+"円");
		System.out.println();
		int acctPerPerson=campTotal/personalAcct.size();
		System.out.println("個人別会計(一人あたり:"+acctPerPerson+"円)");
		System.out.println("——————");
		for(String key:personalAcct.keySet()){
			int income=personalAcct.get(key)-acctPerPerson;
			String str=income>0?"+"+income:""+income;
			System.out.println(key+":"+str);
		}
	}
}

