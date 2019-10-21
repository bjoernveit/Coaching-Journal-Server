package com.bjoernveit.basketball.coaching.journal.server.pojo;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.List;

public class JournalEntry {

    @Id
    public String id;

    @Getter
    private final String text;
    @Getter
    private final List<PracticeFeedback> feedbacks;

    public JournalEntry(String text, List<PracticeFeedback> feedbacks) {
        this.text = text;
        this.feedbacks = feedbacks;
    }


    public void addFeedback(PracticeFeedback feedback){
        feedbacks.add(feedback);
    }

    public void addAll(Collection<PracticeFeedback> feedbacks){
        this.feedbacks.addAll(feedbacks);
    }
}

