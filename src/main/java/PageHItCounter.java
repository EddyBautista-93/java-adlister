import java.io.*;
import java.sql.Date;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/counter")
public class PageHItCounter extends HttpServlet {

    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // This method executes whenever the servlet is hit
        // increment hitCount
        hitCount++;
        String reset = request.getParameter("reset");
        PrintWriter out = response.getWriter();
        String title = "Total Number of Hits";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";


        if(reset == null) {
            out.println(docType +
                    "<html>\n" +
                    "<head><title>" + title + "</title></head>\n" +
                    "<body bgcolor = \"#f0f0f0\">\n" +
                    "<h1 align = \"center\">" + title + "</h1>\n" +
                    "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                    "</body>\n" +
                    "</html>"
            );
        } else {
            init();
            out.println(docType +
                    "<html>\n" +
                    "<head><title>" + title + "</title></head>\n" +
                    "<body bgcolor = \"#f0f0f0\">\n" +
                    "<h1 align = \"center\">" + title + "</h1>\n" +
                    "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                    "</body>\n" +
                    "</html>"
            );
        }

    }

}