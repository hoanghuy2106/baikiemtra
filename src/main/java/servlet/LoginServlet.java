package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String message;
        if ("admin".equals(username) && "123".equals(password)) {
            message = "Đăng nhập thành công! Chào " + username;
        } else {
            message = "Đăng nhập thất bại. Tên đăng nhập hoặc mật khẩu sai.";
        }

        request.setAttribute("message", message);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
