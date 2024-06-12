package org.example.exercice4.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice4.model.Cat;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "catServlet", value = "/cats")
public class CatServlet extends HttpServlet {
    private List<Cat> cats;

    @Override
    public void init() throws ServletException {
        cats = new ArrayList<>();
       // cats.add(new Cat("toto","tata","tutu",LocalDate.now()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cats",cats);
        getServletContext().getRequestDispatcher("/WEB-INF/cat/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // recupere les infos
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String favMeal = req.getParameter("favMeal");
        LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dateOfBirth"));
        // creation d'un chat
        Cat cat = new Cat(name,breed,favMeal,dateOfBirth);
        // ajout du chat a ma liste de chats
        cats.add(cat);

        req.setAttribute("cats",cats);
        getServletContext().getRequestDispatcher("/WEB-INF/cat/add.jsp").forward(req,resp);
    }
}
