package org.example.exercices.exercice11Exception.exercice4;

import org.example.exercices.exercice11Exception.exercice4.exception.InvalidAgeException;
import org.example.exercices.exercice11Exception.exercice4.model.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        try {
            while (true){
                System.out.println("Ajout d'un nouvel etudiant :");
                System.out.println("Nom : ");
                String name = scanner.next();
                System.out.println("Age : ");
                int age = scanner.nextInt();

                students.add(new Student(name,age));
                System.out.println();
            }
        }catch (InputMismatchException e){
            System.out.println("Erreur : Format d'age invalide. Fin de la saisie");
        }catch (InvalidAgeException e){
            System.out.println("erreur : "+e.getMessage()+ " Fin de la saisie.");
            scanner.nextLine();
        }finally {
            // Affichage des etudiants
            System.out.println("\n Liste des Etudiants");
            students.stream().forEach(System.out::println);
            scanner.close();
        }
    }
}
