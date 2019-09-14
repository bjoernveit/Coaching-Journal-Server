package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.DBEntry;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DBService implements StorageService {
    private final DBEntryGetter getter;
    private final DBEntrySaver saver;

    @Autowired
    public DBService(DBEntryGetter getter, DBEntrySaver saver) {
        this.getter = getter;
        this.saver = saver;
    }

    @Override
    public void saveEntry(JournalEntry entry) throws DBException {
        saver.save(new DBEntry(entry));
    }

    @Override
    public List<JournalEntry> getAllEntries() {
        try {
            return getter.getAll().stream()
                    .map(DBEntry::getJournalEntry)
                    .collect(Collectors.toList());
        } catch (DBException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
