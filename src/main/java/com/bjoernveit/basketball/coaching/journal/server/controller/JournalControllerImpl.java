package com.bjoernveit.basketball.coaching.journal.server.controller;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import com.bjoernveit.basketball.coaching.journal.server.service.db.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class JournalControllerImpl implements JournalController {

    final private DBService dbService;

    @Autowired
    public JournalControllerImpl(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public ResponseEntity<String> add(JournalEntry entry) {
        try {
            dbService.saveEntry(entry);
            return ResponseEntity.ok("SUCCESS");
        } catch (DBException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("FAILED");
    }

    @Override
    public ResponseEntity<List<JournalEntry>> getFullJournal() {
        return ResponseEntity.ok(dbService.getAllEntries());
    }
}
