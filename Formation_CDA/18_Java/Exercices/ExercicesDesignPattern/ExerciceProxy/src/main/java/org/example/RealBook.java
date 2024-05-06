package org.example;

public class RealBook implements Book{

    @Override
    public void readBook(String bookTitle, String bookContent) {
        System.out.println("Titre: " + bookTitle +  " Contenu du livre: " + bookContent);
    }
}
