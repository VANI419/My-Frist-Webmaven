import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/msg")
public class PrintMessage extends GenericServlet{
	public static void main(String[] args) {
		}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String msg=req.getParameter("m");
		PrintWriter pw=res.getWriter();
		pw.write("<>html<body><h1>"+msg+"</html></body></h1>");
		
	}

}
