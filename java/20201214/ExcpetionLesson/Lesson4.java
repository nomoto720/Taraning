import java.io.*;
import java.util.*;
public class Lesson4{
	public static void main(String[] args)throws Exception{
		showMessage();
		/*try{
			showMessage();
		}catch(Exception e){
			;
		}*/
	}
	static void showMessage() throws Exception{
		System.out.println("表示します");
		Thread.sleep(2000);
		System.out.println("表示終了");
	}
}
