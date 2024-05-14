package org.example.Demo2.Util;

import org.example.Demo2.DAO.CommandeDAO;
import org.example.Demo2.DAO.PlanteDAO;
import org.example.Demo2.Entity.Commande;
import org.example.Demo2.Entity.Plante;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ihm {

    private Connection connection;
    private PlanteDAO planteDAO;
    private CommandeDAO commandeDAO;

    private Scanner scanner;

    public Ihm (){
        scanner = new Scanner(System.in);
        try{
            connection = DataBaseManager.getConnection();
            planteDAO = new PlanteDAO(connection);
            commandeDAO = new CommandeDAO(connection,planteDAO);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void start (){
        int entry ;
        while(true){
            System.out.println("--- Gestion de Plante ---");
            System.out.println("1/ Creation de plante");
            System.out.println("2/ afficher toutes les plantes");
            System.out.println("3/ ajouter une commande");
            System.out.println("4/ commande par l'id");
            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry){
                case 1 :
                    createPlante();
                    break;
                case 2:
                    getAllPlante();
                    break;
                case 3:
                    addCommande();
                    break;
                case 4:
                    commandeById();
                    break;
                default:
                    return;
            }
        }
    }

    private void createPlante (){
        System.out.println("--- creation de plante ---");
        System.out.println("nom de la plante :");
        String name = scanner.nextLine();
        System.out.println("couleur de la plante:");
        String color = scanner.nextLine();
        System.out.println("age de la plante :");
        int age =  scanner.nextInt();
        scanner.nextLine();
        try{

            Plante plante =planteDAO.save(Plante.builder().name(name).color(color).age(age).build());
            System.out.println("la plante a ete cree" + plante);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void getAllPlante (){
        try {
            List<Plante> plantes = planteDAO.get();
            for(Plante plante : plantes){
                System.out.println(plante);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void addMultiplePlante(){
        List<Plante> plantes = new ArrayList<>();
        plantes.add(Plante.builder().name("coquelicot").color("red").age(0).build());
        plantes.add(Plante.builder().name("poisBleu").color("blue").age(1).build());

        planteDAO.multipleAdd(plantes);
    }

    public void addCommande (){
        System.out.println("-- ajout de commande --");
        System.out.println("prix de la commande :");
        float prix = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("quantité de la commande");
        int quantite = scanner.nextInt();
        scanner.nextLine();
        System.out.println("id de la plante de la commande :");
        int idPlante = scanner.nextInt();
        scanner.nextLine();

        try {
            Commande commande = Commande.builder().prix(prix).quantite(quantite).plante(planteDAO.get(idPlante)).build();
            Commande commandeCreated = commandeDAO.save(commande);
            System.out.println("la commande a ete cree" + commandeCreated);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void commandeById(){
        System.out.println("-- recuperer une commande par son id --");
        System.out.println("id de la commande a recuperer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            System.out.println(commandeDAO.get(id));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
