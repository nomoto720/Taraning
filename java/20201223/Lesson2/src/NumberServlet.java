import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random rand=new Random();
		List<Integer> list=new ArrayList<>();
		int count=0;
		while(true) {
			int num=rand.nextInt(900)+100;
			list.add(num);
			count++;
			if(num==777){
				break;
			}
		}

		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>numeber</title>");
		out.println("</head>");
		out.println("<body>");
		for (int i=0;i<list.size();i++){
			 int number=list.get(i);
		      out.println("<p>"+number+"</p>");
		}
		out.println("<p>"+count+"回目に出ました！</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
