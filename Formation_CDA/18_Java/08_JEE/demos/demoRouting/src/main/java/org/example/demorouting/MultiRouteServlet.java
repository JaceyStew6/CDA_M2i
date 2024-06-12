package org.example.demorouting;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "multirouteservlet", value = {"/multi-routes","/multi","/multi/*"})
public class MultiRouteServlet extends HttpServlet {

    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenoms = new ArrayList<>();
        prenoms.add("John");
        prenoms.add("Doe");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = (req.getPathInfo() != null && !req.getPathInfo().isEmpty()) ? req.getPathInfo() : "" ;
        String searchName = "";
        if (pathInfo != null && !pathInfo.isEmpty()){
                searchName = prenoms.get(Integer.parseInt(pathInfo.substring(1)));
        }

        req.setAttribute("prenom",searchName);
        req.setAttribute("pathInfo",pathInfo);
        req.getRequestDispatcher("/multi.jsp").forward(req,resp);

    }
}