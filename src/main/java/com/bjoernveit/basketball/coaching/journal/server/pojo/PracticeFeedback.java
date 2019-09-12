package com.bjoernveit.basketball.coaching.journal.server.pojo;


import lombok.Getter;

public class PracticeFeedback {

    @Getter
    private final boolean positive;
    @Getter
    private final String text;

    public PracticeFeedback(boolean positive, String text) {
        this.positive = positive;
        this.text = text;
    }
}
