package hello.servlet.basic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") // 서블릿 애노테이션
public class HelloServlet extends HttpServlet {

    @Override // URL이 호출되면, 자동으로 다음 메서드가 실행된다
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("req = " + req);
        System.out.println("resp = " + resp);

        String userName = req.getParameter("userName");
        System.out.println("userName = " + userName);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello" + userName);
    }
}
