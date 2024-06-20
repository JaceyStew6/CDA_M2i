package org.example.tphopital.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.example.tphopital.service.PatientService;

@WebServlet(name = "patientServlet", value = "/patient/*")
public class PatientServlet extends HttpServlet {
    PatientService patientService;

    @Override
    public void init() throws ServletException {
        patientService = new PatientService();
    }

    //TODO faire le servlet + les autres servlet
}
