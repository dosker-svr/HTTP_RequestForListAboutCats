package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FactAboutCats {
    private final Status status;
    private final String type;
    private final boolean deleted;
    private final String _id;
    private final String user;
    private final String text;
    private final int __v;
    private final String source;
    private final String updatedAt;
    private final String createdAt;
    private final boolean used;

    public FactAboutCats(
                        @JsonProperty("status") Status status,
                         @JsonProperty("type") String type,
                         @JsonProperty("deleted") boolean deleted,
                         @JsonProperty("_id") String _id,
                         @JsonProperty("user") String user,
                         @JsonProperty("text") String text,
                         @JsonProperty("__v") int __v,
                         @JsonProperty("source") String source,
                         @JsonProperty("updatedAt") String updatedAt,
                         @JsonProperty("createdAt") String createdAt,
                         @JsonProperty("used") boolean used
    ) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this._id = _id;
        this.user = user;
        this.text = text;
        this.__v = __v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    @Override
    public String toString() {
        return "FactAboutCats : \n" +
                "status='" + status + '\'' + "  ||||  " +
                ", type='" + type + '\'' + "  ||||  " +
                ", deleted='" + deleted + '\'' + "  ||||  " +
                ", _id='" + _id + '\'' + "  ||||  " +
                ", user='" + user + '\'' + "  ||||  " +
                ", text='" + text + '\'' + "  ||||  " +
                ", __v='" + __v  + '\''+ "  ||||  " +
                ", source='" + source + '\'' + "  ||||  " +
                ", updatedAt='" + updatedAt + '\'' + "  ||||  " +
                ", createdAt='" + createdAt + '\'' + "  ||||  " +
                ", used=" + used + '\'';
    }

    public String get_id() {
        return _id;
    }

    public String getUser() {
        return user;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
