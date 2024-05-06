package org.example.correction.correction_proxy_1;



public class RealBook implements Book {

    private String title;
    private String content;
    public RealBook(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void readBook() {
        System.out.println("Content of "+title + " content "+ content);
    }
}
