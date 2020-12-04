import java.util.*;
public class Lesson{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] n = Arrays.stream(sc.nextLine().split(" ")) 
    .mapToInt(Integer::parseInt)
		.toArray();
		System.out.println(n[0]-n[1]);
	}
}
