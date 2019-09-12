package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;

public interface DBEntrySaver {
    boolean save() throws DBException;
}
