import java.util.*;
public class Main{
	public static void main(String[] args){
		ArrayList<Cat> cats=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		String[] type={"A","B","C"};
		System.out.println("***Cat Collection***");
		while(true){
			System.out.print("1.Collect 2.Play 3.End>");
			int select=scan.nextInt();
			scan.nextLine();
			switch(select){
				case 1:
					int num =rand.nextInt(type.length);
					System.out.println(type[num]+"-type cat appeared!");
					System.out.print("Please name this cat>");
					String name=scan.nextLine();
					Cat cat=new Cat(name,type[num]);
					cat.joined();
					cats.add(cat);
					break;
				case 2:
					if(cats.ixEmpty){
						System.out.println("You do not have anyone to play with.");
					}else{
						for(int i=0;i<cats.size();i++){
							for(int j=i+1;j<cats.size();j++){
								if(cats.get(i).intimacy<cats.get(j).intimacy){
									Cat c=cats.get(i);
									cats.set(i,cats.get(j));
									cats.set(j,c);
								}
							}
						}
						for(int i=0;i<cats.size();i++){
							System.out.print(i+"...");
							cats.get(i).catStatus();
						}
						System.out.print("who do you play with?>");
						int num2=scan.nextInt();
						cats.get(num2).play();
					}
					break;
				case 3:
					System.out.println("Game over");
					return;
			}
		}
	}
}
