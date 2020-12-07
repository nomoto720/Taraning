public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void makeNoize(){
		System.out.println(this.name+"は鳴いたにゃん");
	}
	public void sleep(){
		System.out.println(this.name+"はこたつでおやすみzzz...");
	}
}
