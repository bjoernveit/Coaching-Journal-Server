package com.bjoernveit.basketball.coaching.journal.server.Exception;

public class DBException extends Exception {

    public DBException(String msg, Exception e) {
        super(msg, e);
    }
}
