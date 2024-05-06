package org.example.correction.correction_proxy_1;

;

public class ProxyBook implements Book {

    private String title;
    private String content;
    private Boolean isPremium;

    private Book book;
    public ProxyBook(String title, String content, boolean isPremium) {
        this.title = title;
        this.content = content;
        this.isPremium = isPremium;
    }

    public void readBook() {
        if(isPremium) {
            book = new RealBook(title, content);
        } else {
            throw new RuntimeException("Not allowed");
        }
        book.readBook();
    }
}
