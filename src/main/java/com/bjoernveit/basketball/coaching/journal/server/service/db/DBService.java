package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface DBService {
    void saveEntry(JournalEntry entry) throws DBException;

    @NotNull
    List<JournalEntry> getAllEntries();
}
