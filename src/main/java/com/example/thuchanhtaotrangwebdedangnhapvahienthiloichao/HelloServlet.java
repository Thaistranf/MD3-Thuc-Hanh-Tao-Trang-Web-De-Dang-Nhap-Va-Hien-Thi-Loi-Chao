package com.example.thuchanhtaotrangwebdedangnhapvahienthiloichao;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        if ("admin".equals(username) && "admin".equals(password)) {
            out.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            out.println("<h1>Login Error</h1>");
        }
        out.println("</html>");
    }
}