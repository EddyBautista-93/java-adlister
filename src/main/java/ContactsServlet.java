import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet("/post")
public class ContactsServlet extends HttpServlet {
    private String name;
    private String email;
    private ArrayList<String> contactlist;

    public ContactsServlet(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getContactlist() {
        return contactlist;
    }

    public void setContactlist(ArrayList<String> contactlist) {
        this.contactlist = contactlist;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String title = "Using GET Method to Read Form Data";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "
                + req.getParameter("first_name") + "\n" +
                "  <li><b>Last Name</b>: "
                + req.getParameter("last_name") + "\n" +
                "</ul>\n" +
                "</body>" +
                "</html>"
        );
    }


}
