package com.example.__pathRequest.service;

import com.example.__pathRequest.model.Contact;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ContactService {
    private final Map<UUID, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();

        Contact contactA = Contact.builder()
                .id(UUID.randomUUID())
                .name("Toto")
                .phone("0606060606")
                .age(18)
                .build();

        Contact contactB = Contact.builder()
                .id(UUID.randomUUID())
                .name("Tata")
                .phone("0101010101")
                .age(35)
                .build();

        Contact contactC = Contact.builder()
                .id(UUID.randomUUID())
                .name("Titi")
                .phone("0505050505")
                .age(20)
                .build();

        contacts.put(contactA.getId(), contactA);
        contacts.put(contactB.getId(), contactB);
        contacts.put(contactC.getId(), contactC);
    }

    public List<Contact> getAllContacts(){
        return contacts.values().stream().toList();
    }

    public Contact getContactById(UUID id) {
        return contacts.get(id);
    }

    public Contact getContactByName(String name) {
        return contacts.values().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }
}