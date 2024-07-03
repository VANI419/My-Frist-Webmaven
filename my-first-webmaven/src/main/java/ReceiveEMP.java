import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/emp")
public class ReceiveEMP  extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String empno=req.getParameter("no");
		String name=req.getParameter("name");
		String sal=req.getParameter("sal");
		System.out.println("no");
		System.out.println("name");
		System.out.println("sal");
	}

}
