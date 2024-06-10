package org.example.exercice1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletHTML", value = "/servletHtml")
public class ServletHTML extends HttpServlet {

    private String videoGame;

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet HTML lancé");
        videoGame = "Life is Strange";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Page HTML</h1>");
        writer.println("<p>Jeu annoncé lors du Xbox Showcase : " + videoGame + "<p>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet HTML détruit");
    }
}
