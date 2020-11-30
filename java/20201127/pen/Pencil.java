public class Pencil{
	String color;
	int penLength=5;
	public Pencil(String color){
		this.color=color;
	}
	public void kaku(){
		if(this.penLength>0){
		System.out.printf("%sで書いた！%n",this.color);
		this.penLength-=1;
		}else{
			System.out.println("もう書けません！");
		}
	}	
	public void joho(){
		System.out.println(this.color);
		for(int i=0;i<this.penLength;i++){
			System.out.print("+");
		}
		System.out.println(">");
	}
}

