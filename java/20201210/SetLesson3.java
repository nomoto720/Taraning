import java.util.*;
public class SetLesson3{
	public static void main(String[] args){
		String[] strArray = new String[]{
"emhjopwxaz",
"ykxfjihxvv",
"oqsuoeojku",
"stvzdzdplo",
"ftrmgkauna",
"ackzqxlchf",
"dqttpisosm",
"kfcrgfxenb",
"vwappsvdld",
"gvovlddccr",
"ybaoyevbsl",
"thhujdjaqk",
"luxrfzmlyz",
"zpewohxhvc",
"whcddsgogv",
"hzyjmgrbxw",
"mjmxnxawrw",
"hdndjktido",
"vymqiltdzq"
};
		Set<String> set=new TreeSet<String>();
		for(String s:strArray){
			set.add(s);
		}
		Iterator<String> it=set.iterator();
		int count=0;
		while(it.hasNext()){
			strArray[count]=it.next();
			count++;
		}
		System.out.println(strArray[strArray.length-1]);
	}
}
