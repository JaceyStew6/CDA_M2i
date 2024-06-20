package org.example.tphopital.repository;

import org.example.tphopital.exception.NotFoundException;
import org.example.tphopital.model.Prescription;
import org.hibernate.Transaction;

import java.util.List;

public class PrescriptionRepository extends BaseRepository<Prescription>{
    public PrescriptionRepository() {
    }

    @Override
    public Prescription add(Prescription entity) {
        Transaction transaction= null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public Prescription findById(int id) {
        Prescription prescription = null;
        try {
            session = sessionFactory.openSession();
            prescription = session.get(Prescription.class, id);
            if (prescription == null){
                throw new NotFoundException("Prescription not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return prescription;
    }

    @Override
    public Prescription update(Prescription entity) {
        Transaction transaction = null;

        try {
            session= sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public boolean delete(Prescription entity) {
        Transaction transaction = null;
        boolean result = false;
        try {
            session= sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
            result = true;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }

    public List<Prescription> findAllPrescription(){
        List<Prescription> prescriptions = null;
        try {
            session = sessionFactory.openSession();
            prescriptions = session.createQuery("from Prescription ").list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return prescriptions;
    }
}




/*@WebServlet(name = "productServlet",value = "/product/*")
public class ProductServlet extends HttpServlet {

    ProductService productService;

    @Override
    public void init() throws ServletException {
        productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();



        boolean logged = (session.getAttribute("isLogged") != null) ? (boolean) session.getAttribute("isLogged"): false ;

        if(logged){
            String action = req.getPathInfo();
            System.out.println(action);
            switch (action){
                case "/new":
                    System.out.println("Creation nouveau produit");
                    showNewForm(req,resp);
                    break;
                case "/insert":
                    insertProduct(req,resp);
                    break;
                case "/delete":
                    deleteProduct(req,resp);
                    break;
                case "/edit":
                    showEditForm(req,resp);
                    break;
                case "/details":
                    showProduct(req,resp);
                    break;
                case "/update":
                    updateProduct(req,resp);
                    break;
                case "/list":
                    listProduct(req,resp);
                    break;
                default:
                    System.out.println("Valeur par défaut");
                    listProduct(req,resp);
                    break;
            }
        }else {
            resp.sendRedirect(getServletContext().getContextPath()+"/user/pagesignin");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

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


    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.findById(id);
        if(product != null){
            productService.delete(id);
        }
        resp.sendRedirect("list");
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.findById(id);
        req.setAttribute("product",product);
        req.getRequestDispatcher("WEB-INF/views/form-products.jsp").forward(req,resp);
    }

    private void updateProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String brand = req.getParameter("marque");
        String reference = req.getParameter("reference");
        int stock = Integer.parseInt(req.getParameter("stock"));
        double prix = Double.parseDouble(req.getParameter("prix"));
        LocalDate dateOfPurchase = LocalDate.parse(req.getParameter("dateAchat"));

        Product product = productService.findById(id);

        productService.update(id,brand,reference,dateOfPurchase,prix,stock);

        resp.sendRedirect("list");
    }*/
