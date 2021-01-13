package com.example.assignment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "login", urlPatterns = {"assignment_war_exploded/billing", "/billing"})
public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CheckData check = new CheckData();
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
        String cc_ccv = request.getParameter("cc-ccv");
        String doctype = "<!doctype html>";
        if(check.checkUsername(firstName)
                && check.checkSurname(lastName)
                && check.checkUsername(username)
                && check.checkemail(email)
                && check.checkAddress(addr1)
                && check.countryChecker(country)
                && check.zipChecker(zip)){
            if(CheckBills.checkBill(cc_number,cc_ccv)){
                RequestDispatcher rd = request.getRequestDispatcher("jsp/cover.jsp");
                rd.forward(request,response);
                //response.sendRedirect("assignment_war_exploded/jsp/cover.jsp");
            } else{
                out.println(doctype + "<html>" +
                        "<body>" +
                        "Given Billing information is incorrect" +
                        "</body>" +
                        "</html>"
                        );
                response.sendRedirect("jsp/billing.jsp");
            }
        } else{
            out.println(doctype + "<html>" +
                    "<body>" +
                    "Given Username information is incorrect" +
                    "</body>" +
                    "</html>"
            );
            response.sendRedirect("jsp/billing.jsp");
        }
    }

    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
