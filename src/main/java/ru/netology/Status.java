package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    private boolean verified;
    private int sentCount;
    private String feedback;

    public Status(
            @JsonProperty("verified") boolean verified,
            @JsonProperty("sentCount") int sentCount,
            @JsonProperty("feedback") String feedback
    ) {
        this.verified = verified;
        this.sentCount = sentCount;
        this.feedback = feedback;
    }

//    public Status(
//            @JsonProperty("verified") boolean verified,
//            @JsonProperty("sentCount") int sentCount
//    ) {
//        this.verified = verified;
//        this.sentCount = sentCount;
//    }


    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
