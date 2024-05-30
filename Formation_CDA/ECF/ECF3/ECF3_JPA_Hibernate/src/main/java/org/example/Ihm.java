package org.example;

import org.example.entities.Customer;
import org.example.entities.Product;
import org.example.entities.ProductCategory;
import org.example.entities.Vente;
import org.example.services.CustomerService;
import org.example.services.ProductService;
import org.example.services.SaleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Ihm {

    private ProductService productService;
    private CustomerService customerService;
    private SaleService saleService;
    private Scanner scanner;

    public Ihm(){
        scanner = new Scanner(System.in);
        productService = new ProductService();
        customerService = new CustomerService();
        saleService = new SaleService();
    }

    public void start(){
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice){
                case "1" -> addProduct();
                case "2" -> updateProduct();
                case "3" -> findProductById();
                case "4" -> deleteProduct();
                case "5" -> getAllProducts();
                case "6" -> addCustomer();
                case "7" -> updateCustomer();
                case "8" -> findCustomerById();
                case "9" -> deleteCustomer();
                case "10" -> getAllCustomers();
                case "11" -> registerSale();
                case "12" -> salesHistory();
                case "13" -> stockByProduct();
                case "14" -> performanceByProduct();
                case "15" -> saleByCategory();
                case "16" -> saleByPeriod();
                case "17" -> saleByCustomer();
                case "0" -> System.out.println("Goodbye !!!");
                default -> System.out.println("Invalid Choice");
            }

        }while (!choice.equals("0"));
        // Sortie du menu et fin du programme
        productService.close();
        customerService.close();
        saleService.close();
    }

    private void menu(){
        System.out.println("#######  Menu  ######");
        System.out.println(" ------- Gestion de l'inventaire -------");
        System.out.println("1. Ajouter un article");
        System.out.println("2. Modifier un article");
        System.out.println("3. Trouver un article");
        System.out.println("4. Supprimer un article");
        System.out.println("5. Afficher la liste des articles");

        System.out.println(" ------- Gestion des clients -------");
        System.out.println("6. Ajouter un client");
        System.out.println("7. Modifier une fiche client");
        System.out.println("8. Trouver un client");
        System.out.println("9. Supprimer un client");
        System.out.println("10. Afficher la liste des clients");

        System.out.println(" ------- Gestion des ventes -------");
        System.out.println("11. Enregistrer une vente");

        System.out.println(" ------- Tableau de bord -------");
        System.out.println("12. Historique de toutes les ventes réalisées");
        System.out.println("13. Stocks disponibles par produits");
        System.out.println("14. Performances des produits");
        System.out.println("15. Ventes par catégorie");
        System.out.println("16. Ventes par période");
        System.out.println("17. Ventes par client");

        System.out.println("0. Quitter");
        System.out.println("Votre choix :");
    }

    private void addProduct(){
        System.out.println("Création d'un produit");
        System.out.println(" Description ");
        String desc = scanner.nextLine();
        System.out.println(" Catégorie (MEN - WOMEN - KIDS) ");
        String cat = scanner.nextLine();
        System.out.println(" Taille (XS-S-M-L-XL) ");
        String size = scanner.nextLine();
        System.out.println(" Prix ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Stock ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Product o = new Product();
        o.setDescription(desc);
        o.setProductCategory(ProductCategory.valueOf(String.valueOf(cat)));
        o.setSize(size);
        o.setPrice(price);
        o.setStock(stock);

        productService.create(o);
    }

    private void updateProduct(){
        //TODO updateProduct
    }
    private void findProductById(){
        System.out.println("Afficher un produit par son id");
        System.out.println("Id du produit : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Product product = productService.findById(id);
        if (product != null){
            System.out.println(product);
        } else {
            System.out.println("Aucun produit trouvé");
        }
    }
    private void deleteProduct(){
        System.out.println("Supprimer un produit par son id");
        System.out.println("Id du produit : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Product product = productService.findById(id);
        if (product != null){
            productService.delete(product);
            System.out.println("Le produit a bien été supprimé");
        } else {
            System.out.println("Aucun produit trouvé");
        }
    }
    private void getAllProducts(){
        System.out.println("Liste de tous les produits");
        productService.findAll();
    }

    private void addCustomer(){
        System.out.println("Création d'une fiche client");
        System.out.println(" Nom ");
        String name = scanner.nextLine();
        System.out.println(" Adresse email");
        String email = scanner.nextLine();

        Customer o = new Customer();
        o.setName(name);
        o.setEmailAddress(email);

        customerService.create(o);
    }
    private void updateCustomer(){
        //TODO updateCustomer
    }
    private void findCustomerById(){
        System.out.println("Afficher un client par son id");
        System.out.println("Id du client : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Customer customer = customerService.findById(id);
        if (customer != null){
            System.out.println(customer);
        } else {
            System.out.println("Aucun client trouvé");
        }
    }
    private void deleteCustomer(){
        System.out.println("Supprimer un client par son id");
        System.out.println("Id du client : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Customer customer = customerService.findById(id);
        if (customer != null){
            customerService.delete(customer);
            System.out.println("Le client a bien été supprimé");
        } else {
            System.out.println("Aucun client trouvé");
        }
    }
    private void getAllCustomers(){
        System.out.println("Liste de tous les clients");
        customerService.findAll();
    }

    private void registerSale(){
        System.out.println("Renseigner une vente");

        System.out.println(" Id du client ");

        int customerId = scanner.nextInt();
        scanner.nextLine();
        Customer customer = customerService.findById(customerId);
        System.out.println("Client trouvé: " + customer);

        Vente o = new Vente();
        List<Product> products = new ArrayList<>();

        String choice;
        do {
            menuVente();
            choice = scanner.nextLine();
            switch (choice){
                case "1" :
                    System.out.println("Id du produit :");
                    int productId = scanner.nextInt();
//                    scanner.nextLine();
                    Product product = productService.findById(productId);
                    products.add(product);
                    break;
                case "0" :
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (!choice.equals("0"));

        o.setCustomer(customer);
        o.setProducts(products);

        saleService.create(o);

    }

    private void menuVente(){
        System.out.println("###### Menu des ventes ######");
        System.out.println("1. Ajouter un produit par son id");
        System.out.println("0. Quitter");
        //TODO Ajouter possibilité d'annuler
    }

    private void salesHistory(){
        //TODO afficher le détail
        System.out.println("Liste de toutes les ventes");
        saleService.findAll();
    }
    private void stockByProduct(){
        //TODO stockByProduct
    }
    private void performanceByProduct(){
        //TODO performanceByProduct
    }

    private void saleByCategory(){
        //TODO saleByCategory
    }
    private void saleByPeriod(){
        //TODO saleByPeriod
    }
    private void saleByCustomer(){
        //TODO saleByCustomer
    }
}
