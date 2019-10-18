import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        resp.setContentType("text.html");
        PrintWriter out = resp.getWriter();
        if(name == null){
            out.println("Hello, World");
            }
        else {
            out.println("Hello, "+ name);
        }

    }


//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String fruit = req.getParameter("fruit");
//        resp.setContentType("text.html");
//        PrintWriter out = resp.getWriter();
//        out.println("<h1>Hello," + fruit + "</h1>");
//    }
}
