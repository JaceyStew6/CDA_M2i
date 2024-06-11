package org.example.exercice1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Builder;
import lombok.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@WebServlet(name = "personServlet", value = "/personServlet")
public class PersonServlet extends HttpServlet {

    private List<Person> persons;

    @Override
    public void init() throws ServletException {
        Person person1 = Person.builder().lastName("Black").firstName("Max").age(29).build();
        Person person2 = Person.builder().lastName("Caulfield").firstName("Maxine").age(20).build();
        Person person3 = Person.builder().lastName("Price").firstName("Chloe").age(20).build();

        persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("persons", persons);
        getServletContext().getRequestDispatcher("/person.jsp").forward(req, resp);
    }
}
