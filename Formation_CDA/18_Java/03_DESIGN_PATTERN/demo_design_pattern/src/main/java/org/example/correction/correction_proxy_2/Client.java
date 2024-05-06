package org.example.correction.correction_proxy_2;

public class Client {
    public static void main(String[] args) {
        Document document = new ProxyDocument("d1");
        document.read();
        document.edit();
        document.read();
        Document document2 = new ProxyDocument("d2");
        document2.read();
        document2.edit();
        document2.read();
        LogSystem.getInstance().displayLog();
    }
}
