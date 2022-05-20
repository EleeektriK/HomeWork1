package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet1")
public class FirstServlet1 implements Servlet {

    Product products = new Product();

    private static Logger logger = LoggerFactory.getLogger(FirstServlet1.class);
    private transient ServletConfig config;



    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");

        res.getWriter().println("<html><body><table>");
        res.getWriter().printf("<tr><th>id</th><th>title</th><th>cost</th></tr>");
        res.getWriter().println("<tr><td>1</td><td>Milk<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>2</td><td>Water<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>3</td><td>Apple<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>4</td><td>Cheese<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>5</td><td>Orange<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>6</td><td>Pineaple<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>7</td><td>Chicken<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>8</td><td>meat<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>9</td><td>Sprite<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("<tr><td>10</td><td>Cola<td>" + getRandom() +"</td></tr>");
        res.getWriter().println("</table></body></html>");



    }

    @Override
    public String getServletInfo() {
        return "FirstServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());

    }

    public static double getRandom(){
        double x = Math.random() * 600;
        return x;
    }
}
