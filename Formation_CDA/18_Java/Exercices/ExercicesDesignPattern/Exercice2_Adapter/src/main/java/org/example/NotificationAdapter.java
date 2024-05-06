package org.example;

public class NotificationAdapter implements SmsService {

    private EmailService emailService;

    public NotificationAdapter(){
        emailService = new EmailService();
    }

    @Override
    public void sendSms(String number, String message) {
        emailService.sendEmail();

    }
}
