import java.util.*;
  2 public class Schedule{
  3   public static void main(String[] args){
  4     String[] schedule=new String[7];
  5     String[] dayWeek={"月","火","水","木","金","土","日"};
  6     for(int i=0;i<schedule.length;i++){
  7     System.out.printf("%s曜日の予定は>",dayWeek[i]);
  8     schedule[i]=new Scanner(System.in).nextLine();
  9     }
 10     System.out.println();
 11     System.out.print("何曜日の予定が知りたいです(例：木)>");
 12     String day=new Scanner(System.in).nextLine();
 13     for(int i=0;i<dayWeek.length;i++){
 14       if(day .equals(dayWeek[i])){
 15         System.out.printf("%s曜日の予定は%sです。%n",day,schedul    e[i]);
 16       }
 17     }
 18       System.out.println();
 19   }
 20 }

