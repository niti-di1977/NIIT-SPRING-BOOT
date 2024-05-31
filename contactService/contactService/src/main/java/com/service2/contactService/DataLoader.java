package com.service2.contactService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service2.contactService.beans.Contacts;
import com.service2.contactService.service.repo.ContactRepo;

@Component
public class DataLoader {

    private final ContactRepo contactsRepository;

    @Autowired
    public DataLoader(ContactRepo contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    @PostConstruct
    public void loadDummyData() {
        // Create and save dummy contacts
       Contacts contact1 = new Contacts(1, "email1@example.com", "1234567890", 1);
        Contacts contact2 = new Contacts(2, "email2@example.com", "0987654321", 1);
        Contacts contact3 = new Contacts(3, "email3@example.com", "9876543210", 1);
        Contacts contact4 = new Contacts(4, "email4@example.com", "0123456789", 2);
        Contacts contact5 = new Contacts(5, "email5@example.com", "6789012345", 2);
        Contacts contact6 = new Contacts(6, "email6@example.com", "5432109876", 2);
        Contacts contact7 = new Contacts(7, "email7@example.com", "1357924680", 3);
        Contacts contact8 = new Contacts(8, "email8@example.com", "2468013579", 3);
        Contacts contact9 = new Contacts(9, "email9@example.com", "1122334455", 3);
        Contacts contact10 = new Contacts(10, "email10@example.com", "9988776655", 4);

        contactsRepository.save(contact1);
        contactsRepository.save(contact2);
        contactsRepository.save(contact3);
        contactsRepository.save(contact4);
        contactsRepository.save(contact5);
        contactsRepository.save(contact6);
        contactsRepository.save(contact7);
        contactsRepository.save(contact8);
        contactsRepository.save(contact9);
        contactsRepository.save(contact10);

        System.out.println("Dummy data loaded successfully.");
  }
}
