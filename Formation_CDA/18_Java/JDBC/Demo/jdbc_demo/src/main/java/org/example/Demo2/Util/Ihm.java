package org.example.Demo2.Util;

import org.example.Demo2.DAO.PlanteDAO;
import org.example.Demo2.Entity.Plante;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Ihm {

    private Connection connection;
    private PlanteDAO planteDAO;

    private Scanner scanner;

    public Ihm (){
        scanner = new Scanner(System.in);
        try{
            connection = DataBaseManager.getConnection();
            planteDAO = new PlanteDAO(connection);
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
            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry){
                case 1 :
                    createPlante();
                    break;
                case 2:
                    getAllPlante();
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
            Plante plante =planteDAO.createPlant(name,color,age);
            System.out.println("la plante a ete cree" + plante);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void getAllPlante (){
        try {
            List<Plante> plantes = planteDAO.getAllPlante();
            for(Plante plante : plantes){
                System.out.println(plante);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
