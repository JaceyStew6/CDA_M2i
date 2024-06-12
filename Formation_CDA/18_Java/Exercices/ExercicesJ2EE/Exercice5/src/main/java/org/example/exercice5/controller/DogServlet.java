package org.example.exercice5.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice5.entity.Dog;
import org.example.exercice5.service.DogService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "dogServlet", value = "/dogs")
public class DogServlet extends HttpServlet {
    private DogService dogService;
    List<Dog> dogs;

    @Override
    public void init() throws ServletException {
        dogService = new DogService();
//        dogs = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);
        getServletContext().getRequestDispatcher("/WEB-INF/dog/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthDate"));

        Dog dog = new Dog(name, breed, birthDate);
        dogs.add(dog);
        req.setAttribute("dogs", dogs);

        getServletContext().getRequestDispatcher("/WEB-INF/dog/add.jsp").forward(req, resp);
    }
}
