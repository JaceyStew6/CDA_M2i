package org.example.exercice4.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice4.model.Dog;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "dogFormServlet", value = "/dogForm")
public class DogFormServlet extends HttpServlet {

    private List<Dog> dogs;

    @Override
    public void init() throws ServletException {
        dogs = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);
        getServletContext().getRequestDispatcher("/addDog.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String favoriteMeal = req.getParameter("favoriteMeal");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthDate"));

        System.out.println(name+" "+breed+" "+favoriteMeal+" "+ birthDate);

    }
}
