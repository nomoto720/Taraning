import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい>");
		int bookPage=scan.nextInt();
		System.out.print("本の価格を入力して下さい>");
		int bookPrice=scan.nextInt();
		Book book=new Book(bookPage,bookPrice);
		System.out.print("ノートのページ数を入力して下さい>");
		int notePage=scan.nextInt();
		System.out.print("ノートの価格を入力して下さい>");
		int notePrice=scan.nextInt();
		NoteBook notebook=new NoteBook(notePage,notePrice);
		while(true){
			System.out.print("1.本の情報表示2.ノートの情報表示3.ノートに追加書き込み4.終了>");
			int select=scan.nextInt();
			scan.nextLine();
			switch(select){
				case 1:
					book.showStatus();
					break;
				case 2:
					notebook.showStatus();
					break;
				case 3:
					System.out.print("書き込む内容を入力してください>");
					String str=scan.nextLine();
					notebook.write(str);
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
		
	}
}
