package org.example.exercice1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "servletJSP", value = "/servletJSP")
public class ServletJSP extends HttpServlet {

    private String videoGame;

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet JSP est lancé");
        videoGame = "Fable";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("videoGame", videoGame);
        getServletContext().getRequestDispatcher("/page.jsp").forward(req, resp);
    }
}
