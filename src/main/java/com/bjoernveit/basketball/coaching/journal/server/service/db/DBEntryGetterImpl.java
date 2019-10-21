package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DBEntryGetterImpl implements DBEntryGetter {


    @Autowired
    JournalMongoRepo mongo;

    @Override
    public List<JournalEntry> getAll() throws DBException {
        return mongo.findAll();
    }
}
