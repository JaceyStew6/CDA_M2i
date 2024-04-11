package org.example.demos.demo02Static;

public class Chat {
    private String nom;
    private int age;
    private String race;

    // attributs statiques
    private static final String espece = "Felis Catus";
    private static int nbChats = 0;

    public Chat(){
        this("Tigrou", 5, "Tigre");
        // nbChats++; // /!\ celà augmentera 2 fois le compteur
    }

    public Chat(String nom, int age, String race) {
        this.nom = nom;
        this.age = age;
        this.race = race;
        nbChats++;
    }

    public static String getEspece() {
        return espece;
//        return Chat.espece;
    }

//    public static void setEspece(String espece) {
//        Chat.espece = espece; // impossible car espece est final
//    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void miauler(){
        System.out.println("Le chat " + this.nom + " Miaule !");
    }

    @Override
    public String toString() {
        return "Chat{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }
}
