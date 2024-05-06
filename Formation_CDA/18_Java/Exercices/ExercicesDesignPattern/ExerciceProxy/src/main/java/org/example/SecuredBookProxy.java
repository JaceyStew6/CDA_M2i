package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecuredBookProxy implements Book{

    private RealBook realBook;
    private List<String> allowedBooks;

    public SecuredBookProxy() {
        realBook = new RealBook();
        allowedBooks = new ArrayList<>(Arrays.asList("Hunger Games", "Wicked", "Wild Cards"));
    }

    @Override
    public void readBook(String bookTitle, String bookContent) {
        boolean isUserPremium = false;
        for (String d : allowedBooks) {
            if(d.contains(bookTitle)){
                isUserPremium = true;
                break;
            }
        }
        if (isUserPremium){
            realBook.readBook(bookTitle, bookContent);
        } else {
            throw new RuntimeException("Not allowed");
        }
    }
}

