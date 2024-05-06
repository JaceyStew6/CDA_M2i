package org.example.correction.correction_proxy_1;

public class Client {
    public static void main(String[] args) {
        ProxyBook proxyBook = new ProxyBook("1984", "Content of 1984", false);
        proxyBook.readBook();
    }
}
