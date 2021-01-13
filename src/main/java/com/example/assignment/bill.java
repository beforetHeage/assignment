package com.example.assignment;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bill", value = "/bill")
public class bill extends HttpServlet {
    private String message;

    public void init() {
        message = "Welcome!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String method = request.getParameter("method");
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        RequestDispatcher rd = request.getRequestDispatcher("/jsp/billing.jsp");
        rd.forward(request,response);
    }

    public void destroy() {
    }
}