import java.util.*;
public class Bingo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("幅>");
		int width=scan.nextInt();
		int bingoCard[][]=makeCard(width);
		showCard(bingoCard);
		boolean a=isSame(bingCard[0][0]);
	}
	static int[][] makeCard(int width){
		Random ram=new Random();
		int[][] card=new int[width][width];
		for(int i=0;i<card.length;i++){
				for(int j=0;j<card.length;j++){
						card[i][j]=ram.nextInt(9)+1;
				}
		}
		return card;
	}
		static void showCard(int[][] card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card.length;j++){
				System.out.print(card[i][j]);
			}
			System.out.println();
		}

		/*for(int[] line: bingoCard){
			System.out.println(Arrays.toString(line));
		}*/

		/*for(int[] line: bingoCard){
			for(int n:line){
				System.out.print(n);
			}
			System.out.println();
		}*/
	}
	static boolean isSame(int[] line){
			boolean isSame=true;
			int first=line[0];
			if(int i=1 ; i<line.length ; i++){
				if(first !=line[i]){
				isSame=false;
				break;
				}
			}
			return isSame;
	}
	static int[][] horizontalLines(int[][] card){
		int[][] lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card.length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
}
