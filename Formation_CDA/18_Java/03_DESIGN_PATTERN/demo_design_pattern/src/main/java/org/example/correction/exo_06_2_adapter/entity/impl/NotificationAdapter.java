package org.example.correction.exo_06_2_adapter.entity.impl;


import org.example.correction.exo_06_2_adapter.entity.SmsService;

public class NotificationAdapter implements SmsService {

    EmailService emailService;

    public NotificationAdapter() {
        emailService = new EmailService();
    }

    private String getEmailByPhone(String phone) {
        return phone+"@demo.com";
    }
    @Override
    public void sendSms(String phone, String message) {
        emailService.sendEmail(getEmailByPhone(phone), null, message);
    }
}
