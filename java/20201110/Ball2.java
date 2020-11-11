import java.util.*;
public class Ball2{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false};
		for(int i=0;i<5;i++){
			while(true){
				int num = new Random().nextInt(balls.length);
				if(isPicked[num]){
					continue;
			}
			System.out.println(balls[num]);
			isPicked[num]=true;
			break;
			}		
		}
	}
}
