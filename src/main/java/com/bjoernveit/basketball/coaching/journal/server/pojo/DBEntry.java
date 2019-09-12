package com.bjoernveit.basketball.coaching.journal.server.pojo;

import lombok.Getter;

public class DBEntry {
    @Getter
    private final JournalEntry entry;

    public DBEntry(JournalEntry entry) {
        this.entry = entry;
    }


}
