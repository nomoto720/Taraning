import java.util.*;
public class Building{
	int width;
	static int allWidth;
	static int maxWidth=0;
	public Building(int width){
		this.width=width;
		this.allWidth+=width;
		this.maxWidth=maxWidth<width ? width : maxWidth;
	}
	public void display(){
			for(int i=0;i<this.width;i++){
				for(int j=0;j<this.width;j++){
					System.out.print("#");
				}
				System.out.println();
			}
	}
	public static void displayAll(List<Building> list){
		for(int i=0;i<maxWidth;i++){
				for(int j=0;j<list.size();j++){
					for(int k=0;k<list.get(j).width;k++){
						if(maxWidth-i>list.get(j).width){
							System.out.print(" ");
						}else{
							System.out.print("#");
						}
					}
					System.out.print(" ");
				}
				System.out.println();
		}
	}
}
