import java.util.*;
public class BingoGame{
		public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		BingoGameApp b1=new BingoGameApp();
		String[][] card=b1.makeCard(5);
		b1.showCard(card);
		scan.nextLine();
		
		}
}
class BingoGameApp{
	int count=0;
  static String[][] makeCard(int width){
    Random rand=new Random();
    String[][] card=new String[width][width];
    for(int i=0;i<card.length;i++){
      for(int j=0;j<card.length;j++){
        int ran=rand.nextInt(99)+1;
				card[i][j]=String.valueOf(ran);
      }
    }
    return card;
  }
	 static void showCard(String[][] card){
		if(this.count==1){
			Random rand=new Random();
			int ram=rand.nextInt(99)+1;
			String str=String.valueOf(ram);
		}
    for(int i=0;i<card.length;i++){
      for(int j=0;j<card[i].length;j++){
				if(i==2 && j==2){
					card[i][j]="@@";
					System.out.print(card[i][j]);
					continue;
				}else if(str.equals(card[i][j])){
						card[i][j]="@@";
						System.out.print(card[i][j]);
				}
        System.out.printf("%3s",card[i][j]);
      }
      System.out.println();
			this.count++;
    }
  }
}
