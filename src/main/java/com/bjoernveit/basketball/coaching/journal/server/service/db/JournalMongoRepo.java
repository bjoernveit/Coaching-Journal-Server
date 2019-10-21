package com.bjoernveit.basketball.coaching.journal.server.service.db;

import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JournalMongoRepo extends MongoRepository<JournalEntry, String> {


}
