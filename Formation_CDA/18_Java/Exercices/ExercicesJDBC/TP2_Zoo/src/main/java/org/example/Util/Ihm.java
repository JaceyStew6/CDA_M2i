package org.example.Util;

import org.example.DAO.AnimalDAO;
import org.example.DAO.FoodDAO;
import org.example.Entity.Animal;
import org.example.Entity.Food;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Ihm {

    private Connection connection;
    private AnimalDAO animalDAO;
    private FoodDAO foodDAO;
    private Scanner scanner;

    public Ihm (){
        scanner = new Scanner(System.in);
        try {
            connection = DataBaseManager.getConnection();
            animalDAO = new AnimalDAO(connection);
            foodDAO = new FoodDAO(connection, animalDAO);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void start() {
        int entry;
        while (true) {
            System.out.println("--- Gestion des animaux du zoo ---");
            System.out.println("1/ Création d'une fiche animal");
            System.out.println("2/ Afficher tous les animaux du zoo");
            System.out.println("3/ Enregistrer un repas pour un animal");
//            System.out.println("4/ Recherche un animal par son nom");
            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry) {
                case 1:
                    createAnimal();
                    break;
                case 2:
                    getAllAnimals();
                    break;
                case 3:
                    addFood();
                    break;
//                case 4:
//                    commandeById();
//                    break;
                default:
                    return;
            }
        }
    }

    private void createAnimal(){
        System.out.println("------Création de la fiche animal------");
        System.out.println("Nom :");
        String animalName = scanner.nextLine();
        System.out.println("Espèce :");
        String breed = scanner.nextLine();
        System.out.println("Description :");
        String animalDescription = scanner.nextLine();
        System.out.println("Habitat :");
        String habitat = scanner.nextLine();
        System.out.println("Age :");
        int animalAge = scanner.nextInt();
        scanner.nextLine();

        try {
            Animal animal = animalDAO.save(Animal.builder()
                    .animalName(animalName)
                    .breed(breed)
                    .animalDescription(animalDescription)
                    .habitat(habitat)
                    .animalAge(animalAge)
                    .build());
            System.out.println("L'animal : " + animal + " a bien été crée");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void getAllAnimals(){
        try {
            List<Animal> animals = animalDAO.get();
            for(Animal animal : animals){
                System.out.println(animal);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void addFood(){
        System.out.println("------Ajout repas------");
        System.out.println("Date et heure");
        LocalDate dateAndTime = LocalDate.now();
        System.out.println(dateAndTime);
        System.out.println("Détails du repas :");
        String foodDetails = scanner.nextLine();
        System.out.println("Nom de l'animal à nourrir :");
        String name = scanner.nextLine();

        try {
            Food food = Food.builder()
                    .dateAndTime(dateAndTime)
                    .foodDetails(foodDetails)
                    .animal(animalDAO.getAnimalByName(name))
                    .build();
            Food foodCreated = foodDAO.save(food);
            System.out.println("Le repas a été crée" + foodCreated);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
