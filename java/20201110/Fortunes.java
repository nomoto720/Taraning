import java.util.*;
public class Fortunes{
	public static void main(String[] args){
		String[] fortunes={"大吉","中吉","小吉","凶"};
		int index=new Random().nextInt(fortunes.length);
		System.out.printf("あなたの運勢は%dです%n",fortunes[index]);
	}
}
