package org.example;

public interface NewPaymentProcessor {
    void authenticate(String apiKey);
    double sendPayment(double amount);
}
