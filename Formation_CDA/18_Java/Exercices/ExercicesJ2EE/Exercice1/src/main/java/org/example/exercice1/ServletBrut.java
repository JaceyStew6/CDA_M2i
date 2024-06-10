package org.example.exercice1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletBrut", value = "/servletBrut")
public class ServletBrut extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet texte brut est lancé");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");

        PrintWriter writer = resp.getWriter();
        writer.println("Page texte brut");
        writer.println("Je ne sais pas quoi dire ici mais ça fonctionne");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet texte brut détruit");
    }
}
