package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
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
        saver.save(entry);
    }

    @Override
    public List<JournalEntry> getAllEntries() {
        try {
            return getter.getAll();
        } catch (DBException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
