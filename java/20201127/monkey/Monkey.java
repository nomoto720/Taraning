public class Monkey{
	//フィールド変数
	String name;
	int age;
	//コンストラクタ
	public Monkey(String name,int age){
		this.name=name;
		this.age=age;
	}
	//挨拶メソッド
	public void greet(){
		System.out.printf("こんにちは%s(%d)です。よろしく！%n",this.name,this.age);
	}
	//竹馬をするメソッド
	public void takeuma(){
		System.out.printf("%sは上手に竹馬にのった！",this.name);
	}
	//逆立ちをするメソッド
	public void sakadachi(){
		System.out.printf("%sはひょいと逆立ちをした！",this.name);
	}
}

