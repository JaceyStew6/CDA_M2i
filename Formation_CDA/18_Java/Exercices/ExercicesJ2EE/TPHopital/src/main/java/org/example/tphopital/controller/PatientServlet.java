package org.example.tphopital.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.tphopital.service.PatientService;

import java.io.IOException;

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

    private void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setAttribute("patient", patientService.findAllPatients());
        req.getRequestDispatcher("WEB-INF/views/patients.jsp").forward(req,resp);
    }
}



/*

private void listProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("products",productService.findAll());
    req.getRequestDispatcher("/WEB-INF/views/products.jsp").forward(req,resp);
}

private void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    if(req.getParameter("id") != null){
        req.setAttribute("product",productService.findById(Integer.parseInt(req.getParameter("id"))));
    }else {
        req.setAttribute("product",new Product());
    }
    req.getRequestDispatcher("/WEB-INF/views/form-products.jsp").forward(req,resp);
}

private void showProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    if(req.getParameter("id")  != null){
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.findById(id);
        req.setAttribute("product",product);
        req.getRequestDispatcher("/WEB-INF/views/product.jsp").forward(req,resp);
    }else {
        req.setAttribute("products",productService.findAll());
        req.getRequestDispatcher("/WEB-INF/views/products.jsp").forward(req,resp);
    }
}

private void insertProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String brand = req.getParameter("marque");
    String reference = req.getParameter("reference");
    int stock = Integer.parseInt(req.getParameter("stock"));
    double prix = Double.parseDouble(req.getParameter("prix"));
    LocalDate dateOfPurchase = LocalDate.parse(req.getParameter("dateAchat"));

    Product product = productService.add(brand,reference,dateOfPurchase,prix,stock);

    if(product.getId() > 0){
        resp.sendRedirect("list");
    }else {
        resp.sendRedirect("new");
    }


}
}*/
