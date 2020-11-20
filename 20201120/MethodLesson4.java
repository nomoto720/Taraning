import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		System.out.print("言葉1>");
		String word1=new Scanner(System.in).next();		
		System.out.print("言葉2>");
		String word2=new Scanner(System.in).next();		
		wordCount(word1,word2);
	}
	static void wordCount(String worda, String wordb){
		if(worda.length()==wordb.length()){
			System.out.println("引き分け");
		}else if(worda.length()>wordb.length()){
			System.out.printf("%sの勝ち",worda);
		}else{	
			System.out.printf("%sの勝ち",wordb);
		}
	}
}
