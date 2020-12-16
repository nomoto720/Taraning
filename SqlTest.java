import java.util.*;
public class SqlTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input;
		String answer="CREATE DATABASE folda DEFAULT CHARACTER SET utf8;";
		System.out.print("Q1.foldaというデータベースを作成せよ");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		answer="DOROP DATABASE IF EXISTS foldai;";
		System.out.print("Q2.foldaというデータベースを削除せよ");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		answer="CREATE TABLE men(id INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(30),);";
		System.out.print("Q3.自動連番のidとname(30桁)のあるmenテーブルを作れ。");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		answer="DOROP TABLE IF EXISTS men";
		System.out.print("Q4.menテーブルを削除せよ");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		answer="INSERT INFO men(id,name,updated) VALUES(1,'Jhon','2020-12-16')";
		System.out.print("Q5.menテーブルのidに1,nameにjhon,updatedに2020年12月16日と挿入");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}

		answer="INSERT INTO box(name,age) VALUES('Taro',25);";
		System.out.print("Q.boxﾃｰﾌﾞのレコードにname:Taro、age:25と挿入");
		while(true){
			input=sc.nextLine();
			if(answer.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
	}
}
