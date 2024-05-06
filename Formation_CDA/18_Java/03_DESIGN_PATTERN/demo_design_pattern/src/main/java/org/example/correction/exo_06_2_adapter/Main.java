package org.example.correction.exo_06_2_adapter;


import org.example.correction.exo_06_2_adapter.entity.SmsService;
import org.example.correction.exo_06_2_adapter.entity.impl.NotificationAdapter;

public class Main {
    public static void main(String[] args) {

//        EmailService emailService = new EmailService();
//        emailService.sendEmail("testmail@mail.com", "Test", "Hello world!");

        SmsService notificationAdapter = new NotificationAdapter();
        notificationAdapter.sendSms("0101010101", "Hello world!");

    }
}

