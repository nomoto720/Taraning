public class MethodLesson5{
	public static void main(String[] args){
		midashiMaker(20,"すごい！！");
		System.out.println("すごいことがありました。");
		midashiMaker(30,"大事件が発生しました！");
		System.out.println("大変なことが起こりました");
		midashiMakerAround("Hello");
	}
	static void printLine(int widht){
		for(int i=0;i<widht;i++){
			System.out.print('*');
		}
		System.out.println();
	}
	static void midashiMaker(int widht, String title){
		printLine(widht);
		System.out.println('*'+title);
		printLine(widht);
	}
	static void midashiMakerAround(String title){
			printLine(title.length()+2);
			System.out.println('*'+title+'*');
			printLine(title.length()+2);
	}
}
