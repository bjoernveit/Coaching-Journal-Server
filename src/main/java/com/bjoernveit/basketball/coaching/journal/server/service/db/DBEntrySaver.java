package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.DBEntry;

public interface DBEntrySaver {
    boolean save(DBEntry entry) throws DBException;
}
