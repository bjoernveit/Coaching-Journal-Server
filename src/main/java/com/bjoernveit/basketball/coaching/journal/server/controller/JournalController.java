package com.bjoernveit.basketball.coaching.journal.server.controller;

import com.bjoernveit.basketball.coaching.journal.server.pojo.JournalEntry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/journal")
public interface JournalController {
    // @ApiOperation(value = "Save a single Entry in the Journal.")
    //@ApiResponse(code = 200, message = "status code, representing if entry was saved.")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    ResponseEntity<String> add(JournalEntry entry);

    //@ApiOperation(value = "Get all entries of the journal.")
    //@ApiResponse(code = 200, message = "List of journal Entries", response = JournalEntry.class, responseContainer = "List")
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {"application/json"})
    ResponseEntity<List<JournalEntry>> getFullJournal();
}
