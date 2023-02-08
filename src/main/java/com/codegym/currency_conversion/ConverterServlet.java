package com.codegym.currency_conversion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet (name = "ConverterServlet", value="/converterServlet")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter write = resp.getWriter();
        write.println("<html>");
        write.println("<h1> Rate: " + rate + "<h1>");
        write.println("<h1> USD: " + usd + "<h1>");
        write.println("<h1> VND: " + vnd + "<h1>");
        write.println("</html>");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter write = resp.getWriter();
        write.println("<html>");
        write.println("<h1> Rate: " + rate + "<h1>");
        write.println("<h1> USD: " + usd + "<h1>");
        write.println("<h1> VND: " + vnd + "<h1>");
        write.println("</html>");
    }
}
