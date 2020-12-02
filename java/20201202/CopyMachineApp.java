import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("最初に給紙する枚数を入力して下さい>");
		int sheet=scan.nextInt();
		CopyMachine m1=new CopyMachine(sheet);
		while(true){
			System.out.print("1.給紙/2.コピー/3.表示/4.終了>");
			int select=scan.nextInt();
			switch(select){
			case 1:
				System.out.print("給紙する枚数を入力してください>");
				sheet=scan.nextInt();
				m1.feedPaper(sheet);
				break;
			case 2:
				System.out.print("コピーする枚数を入力してください>");
				int copyNum=scan.nextInt();
				m1.copy(copyNum);
				break;
			case 3:
				m1.display();
			default:	
				System.out.println("アプリケーションを終了します");
			return;	
			}
		}
	}
}
class CopyMachine{
	int paper;
	public CopyMachine(int sheet){
		this.paper=sheet > 0 ? sheet :0;
	}
	public void feedPaper(int sheet){
		this.paper+=sheet;
		System.out.printf("%d枚支給しました。%n",sheet);

	}
	public void copy(int sheet){
		this.paper=this.paper > sheet? this.paper-sheet: this.paper;

		//if(this.paper<sheet){
		//	sheet=this.paper;
		//}
		System.out.printf("%d枚コピーしました。%n",sheet);
		//this.paper-=sheet;
	}
	public void display(){
		System.out.printf("コピー可能な枚数は%d枚です%n",this.paper);
	}
}

