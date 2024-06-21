package org.example.tphopital.controller;

import jakarta.persistence.TemporalType;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.tphopital.model.Patient;
import org.example.tphopital.service.PatientService;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "patientServlet", value = "/patient/*")
public class PatientServlet extends HttpServlet {
    PatientService patientService;

    @Override
    public void init() throws ServletException {
        patientService = new PatientService();
    }

    //TODO faire le servlet + les autres servlet

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String action = req.getPathInfo();
        System.out.println(action);
        switch (action){
            case "/new":
                System.out.println("Création d'une fiche patient");
                showNewForm(req,resp);
                break;
            case "/insert":
                insertPatient(req,resp);
                break;
            case "/details":
                showPatient(req,resp);
                break;
            case "/list":
                listPatient(req,resp);
                break;
            default:
                System.out.println("Default value");
                listPatient(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    private void listPatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setAttribute("patients", patientService.findAllPatients());
        req.getRequestDispatcher("WEB-INF/views/patients.jsp").forward(req,resp);
    }

    private void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        if (req.getParameter("id") != null){
            req.setAttribute("patient", patientService.findById(Integer.parseInt(req.getParameter("id"))));
        }else {
            req.setAttribute("patient", new Patient());
        }
        req.getRequestDispatcher("/WEB-INF/views/form-patients.jsp").forward(req,resp);
    }

    private void showPatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("id")  != null){
            int id = Integer.parseInt(req.getParameter("id"));
            Patient patient = patientService.findById(id);
            req.setAttribute("patient",patient);
            req.getRequestDispatcher("/WEB-INF/views/patient.jsp").forward(req,resp);
        }else {
            req.setAttribute("patients",patientService.findAllPatients());
            req.getRequestDispatcher("/WEB-INF/views/patients.jsp").forward(req,resp);
        }
    }

    private void insertPatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastName = req.getParameter("lastname");
        String firstName = req.getParameter("firstname");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthdate"));
        Patient patient = patientService.add(lastName, firstName, birthDate);
        if (patient.getPatientId() > 0) {
            resp.sendRedirect("list");
        } else {
            resp.sendRedirect("new");
        }
    }
}