package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Simple Hello World servlet class. All servlets must extend HttpServlet<br>
 * Notice we are using Annotations instead of web.xml
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    // Just do the same thing as a GET
    doGet(request, response);
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setHeader("Cache-Control", "no-cache");
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();

    String parameter = request.getParameter("id");
    out.println("Hello Again Demo World:  id=" + parameter);
  }

}