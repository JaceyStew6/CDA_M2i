package org.example;

public class PaymentAdapter implements OldPaymentGateway {

    private NewPaymentProcessor newPaymentProcessor;

    public PaymentAdapter(NewPaymentProcessor newPaymentProcessor) {
        this.newPaymentProcessor = new NewPaymentProcessor();
    }


    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentProcessor.authenticate("");
        newPaymentProcessor.sendPayment(amount);
    }
}
