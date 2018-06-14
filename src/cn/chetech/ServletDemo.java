package cn.chetech;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 测试servlet
 */
//@WebServlet("demo")
public class ServletDemo extends HttpServlet{



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo.service");
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req,resp);
    }

}
