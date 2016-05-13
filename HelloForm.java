// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloForm extends HttpServlet { 
  private String message;
  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World Moj";
  }
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
  
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Using GET Method to Read Form Data";
      String copy = "by MaxMoj";
      String docType =
      "<!doctype html>\n";
      out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body style=\"background-color:#99FFCC;color:#000066\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + copy + "</h2>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "
                + request.getParameter("first_name") + "\n" +
                "  <li><b>Last Name</b>: "
                + request.getParameter("last_name") + "\n" +
                "  <li><b>City</b>: "
                + request.getParameter("city") +           
                "</ul>\n" +
                "</body></html>" );
  }
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
   doGet(request, response);
 }
  
  public void destroy()
  {
      // do nothing.
  }
}