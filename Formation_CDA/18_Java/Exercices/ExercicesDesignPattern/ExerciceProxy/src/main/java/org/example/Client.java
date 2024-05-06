package org.example;

public class Client {

    public static void main(String[] args) {
        Book book = new SecuredBookProxy();
        book.readBook("Hunger Games", "L'histoire de Katniss Everdeen");
        book.readBook("Wicked", "La méchante sorcière de l'Ouest du pays d'Oz");
    }
}
