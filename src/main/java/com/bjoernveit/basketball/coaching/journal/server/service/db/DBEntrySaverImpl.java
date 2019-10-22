package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBEntrySaverImpl implements DBEntrySaver {

    @Autowired
    JournalMongoRepo mongo;

    @Override
    public boolean save(JournalEntry entry) throws DBException {
        mongo.save(entry);
        return true;
    }
}
