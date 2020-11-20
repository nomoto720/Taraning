import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("言葉>");
		String wordS = new Scanner(System.in).next();
		System.out.println(decoWord(wordS));
	}
	static String decoWord(String wordS){
		return "***"+wordS+"***";
	}
}
