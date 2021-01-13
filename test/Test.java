import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Q1,リクエストスコープにstrを保存せよ");
		String str="";
		String ans="request.setAttribute(\"str\",str)";
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="RequestDispatcher rd=request.getRequestDispatcher(\"Sample\")";
		String ans2="rd.forward(request,response)";
		System.out.println("Q2,Sampleへフォワードせよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("一行目正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		while(true){
			str=sc.nextLine();
			if(ans2.equals(str)){
				System.out.println("二行目正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		
		System.out.println("");

		ans="HttpSession session=request.getSession()";
		System.out.println("Q3.セッションスコープを取得せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");

		ans="session.setAttribute(\"str\",str)";
		System.out.println("Q4,strデータをセッションスコープに保存せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="ServletContext application=getServletContext()";
		System.out.println("Q5,applicationスコープを取得");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="application.setAttribute(\"str\",str)";
		System.out.println("Q6,applicationスコープでstrを保持せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="String str=(String)request.getAttribute(\"str\")";
		System.out.println("Q7,リクエストスコープのstrデータを取得し文字列strに代入せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="HttpSession session=request.getSession()";
		System.out.println("Q8,セッションスコープstrのデータを取得し文字列strに代入せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("一行目正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		ans="String str=(String)session.getAttribute(\"str\")";
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("二行目正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="ServletContext application=getServletContext()";
		System.out.println("Q9,applicationスコープでstrを取得し文字列strに代入せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("一行目正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		ans="String str=(String)application.getAttribute(\"str\")";
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("二行目正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="session.removeAttribute(\"str\")";
		System.out.println("Q10,sessionからstrデータを削除せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="session.invalidate();
		System.out.println("Q11,sessionを破棄せよ");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="";
		System.out.println("Q12,");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
		ans="";
		System.out.println("Q13,");
		while(true){
			str=sc.nextLine();
			if(ans.equals(str)){
				System.out.println("正解");
				break;
			}else{
				System.out.println("不正解");
			}
		}
		System.out.println("");
	}
}