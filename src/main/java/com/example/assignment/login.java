package com.example.assignment;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "login", urlPatterns = {"assignment_war_exploded/login", "/login"})
public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String addr1 = request.getParameter("address");
        String addr2 = request.getParameter("address2");
        String country = request.getParameter("country");
        String zip = request.getParameter("zip");
        String payment_method = request.getParameter("paymentMethod");
        String cc_name = request.getParameter("cc-name");
        String cc_number = request.getParameter("cc-number");
        String cc_expiration = request.getParameter("cc-expiration");
        String cc_ccv = request.getParameter("cc_ccv");
        String title = "Using GET Method to Read Form Data";
        String docType = "<!doctype html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "
                + firstName + "\n" +
                "  <li><b>Last Name</b>: "
                + lastName + "\n" +
                "  <li><b>Username</b>: "
                + username + "\n" +
                "</ul>\n" +
                "</body>"+
                "</html>"
        );
    }

    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
