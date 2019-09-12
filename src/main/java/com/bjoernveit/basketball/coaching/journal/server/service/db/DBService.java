package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;

import java.util.List;

public interface DBService {
    boolean saveEntry(JournalEntry entry) throws DBException;
    List<JournalEntry> getAllEntries();
}
