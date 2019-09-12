package com.bjoernveit.basketball.coaching.journal.server.pojo;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JournalEntry {
    @Getter
    private final String text;
    @Getter
    private final List<PracticeFeedback> feedbacks;

    public JournalEntry(String text) {
        this.text = text;
        this.feedbacks = new ArrayList<>();
    }

    public void addFeedback(PracticeFeedback feedback){
        feedbacks.add(feedback);
    }

    public void addAll(Collection<PracticeFeedback> feedbacks){
        this.feedbacks.addAll(feedbacks);
    }
}

