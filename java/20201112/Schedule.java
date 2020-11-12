import java.util.*;
public class Schedule{
	public static void main(String[] args){
		String[] schedule=new String[7];	
		String[] dayWeek={"月","火","水","木","金","土","日"};	
		for(int i=0;i<schedule.length;i++){
		System.out.printf("%s曜日の予定は>",dayWeek[i]);
		schedule[i]=new Scanner(System.in).nextLine();	
		}
		System.out.println();
		System.out.print("何曜日の予定が知りたいです(例：木)>");
		String day=new Scanner(System.in).nextLine();
		for(int i=0;i<dayWeek.length;i++){
			if(day .equals(dayWeek[i])){
				System.out.printf("%s曜日の予定は%sです。%n",day,schedule[i]);
			}
		}
			System.out.println();
	}
}
