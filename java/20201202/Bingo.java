import java.util.*;
public class Bingo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("幅>");
		int width=scan.nextInt();
		int bingoCard[][]=makeCard(width);
		for(int i=0;i<bingoCard.length;i++){
			for(int j=0;j<bingoCard.length;j++){
			System.out.print(bingoCard[i][j]);
			}
			System.out.println();
		}
	}
	static int[][] makeCard(int width){
		Random ram=new Random();
		int[][] card=new int[width][width];
		for(int i=0;i<card.length;i++){
				for(int j=0;j<card.length;j++){
						card[i][j]=ram.nextInt(8)+1;
				}
		}
		return card;
	}
}
