package com.sneaker.snakergialong.Controller.User;

import com.sneaker.snakergialong.Model.Dao.UserDao;
import com.sneaker.snakergialong.Model.Entities.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Login", urlPatterns =  {"/Login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("txtEmail");
        String password = request.getParameter("txtPassword");

        UserDao userDao = new UserDao(); // constructor User
        User user = new User();
        user = userDao.signIn(username, password);
        if (user == null) {
            request.setAttribute("message", "Cant't Login <br/> Wrong username or password .. ");
//            getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
        } else {
            //set session for login user
            HttpSession session = request.getSession(true);
            session.setAttribute("LoginUser", user);
            session.setMaxInactiveInterval(60*15);
            response.sendRedirect("../webapp/index.jsp");
//            if (user.getuRole().equalsIgnoreCase("admin")) {
//                response.sendRedirect("index.html");   //admin
//            } else {
//                response.sendRedirect("index.jsp");
//            }
        }
    }
}
