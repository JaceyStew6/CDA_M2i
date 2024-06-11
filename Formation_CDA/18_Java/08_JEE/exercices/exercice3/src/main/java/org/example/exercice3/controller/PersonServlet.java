package org.example.exercice3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice3.model.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "personServlet", value = "/person/list")
public class PersonServlet extends HttpServlet {

    private List<Person> personList;

    @Override
    public void init() throws ServletException {
        personList = new ArrayList<>();
        personList.add(new Person("toto","tata",18));
        personList.add(new Person("titi","tutu",81));
        personList.add(new Person("tatu","tota",18));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("persons",personList);

        getServletContext().getRequestDispatcher("/WEB-INF/person/list.jsp").forward(req,resp);

    }
}
