import java.util.*;
public class Sak{
	public static void main(String[] args){
		char[] hello={'H','E','L','L','O'};	
		for(int i=0;i<hello.length/2;i++){
		char temp=hello[i];
		hello[i]=hello[hello.length-1-i];
		hello[hello.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(hello));
		
	}
}
