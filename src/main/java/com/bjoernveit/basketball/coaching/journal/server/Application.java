package com.bjoernveit.basketball.coaching.journal.server;

import com.bjoernveit.basketball.coaching.journal.server.service.db.JournalMongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bjoernveit.basketball.coaching.journal.server")
public class Application implements CommandLineRunner {

    @Autowired
    private JournalMongoRepo repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        /** Minimal mongo repo test.
         JournalEntry journalEntry = new JournalEntry("Today was a good day, I got the mongo to work properly.", Collections.emptyList());
         repository.save(journalEntry);
         List<JournalEntry> allJournalEntries = repository.findAll();
         allJournalEntries.stream().forEach(e -> System.out.println(e.getText()));
         */
    }
}