package com.bjoernveit.basketball.coaching.journal.server.pojo;

import lombok.Getter;

public class DBEntry {
    @Getter
    private final JournalEntry journalEntry;

    public DBEntry(JournalEntry journalEntry) {
        this.journalEntry = journalEntry;
    }


}
