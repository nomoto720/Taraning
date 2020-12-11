import java.util.*;
public class Spainsh{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Map<String,String> map=new HashMap<>();
		map.put("月", "Lunes(ルネス)");
		map.put("火", "Martes(マルテス)");
		map.put("水", "Miércoles(ミエルコレス)");
		map.put("木", "Jueves(フエベス)");
		map.put("金", "Viernes(ビエルネス)");
		map.put("土", "Sábado(サバド)");
		map.put("日", "Domingo(ドミンゴ)");
		while(true){
			System.out.print("調べたいスペイン語の曜日を入力してください。>");
			String word =sc.nextLine();
			if(map.containsKey(word)){
				System.out.println(word+":"+map.get(word));
			}else{
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
