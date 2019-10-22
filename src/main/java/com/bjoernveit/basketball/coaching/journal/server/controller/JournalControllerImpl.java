package com.bjoernveit.basketball.coaching.journal.server.controller;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import com.bjoernveit.basketball.coaching.journal.server.service.db.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/journal")
public class JournalControllerImpl implements JournalController {

    final private StorageService storageService;

    @Autowired
    public JournalControllerImpl(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public ResponseEntity<String> add(JournalEntry entry) {
        try {
            storageService.saveEntry(entry);
            return ResponseEntity.ok("SUCCESS");
        } catch (DBException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("FAILED");
    }

    @Override
    public ResponseEntity<List<JournalEntry>> getFullJournal() {
        return ResponseEntity.ok(storageService.getAllEntries());
    }

    @RequestMapping("/ready")
    public ResponseEntity<String> checkIfStarted() {
        return ResponseEntity.ok("Server running.");
    }

}
