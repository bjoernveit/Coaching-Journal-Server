package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.Exception.DBException;
import com.bjoernveit.basketball.coaching.journal.server.pojo.DBEntry;

import java.util.List;

public interface DBEntryGetter {
    List<DBEntry> getAll() throws DBException;
}
