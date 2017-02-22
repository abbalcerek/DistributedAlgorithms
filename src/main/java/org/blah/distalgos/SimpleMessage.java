package org.blah.distalgos;

/**
 * Created by adam on 21.02.17.
 */
public class SimpleMessage {

    private long id;
    private long timestamp;
    private String senderId;
    private String content;

    public SimpleMessage(long id, long timestamp, String senderId, String content) {
        this.id = id;
        this.timestamp = timestamp;
        this.senderId = senderId;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getContent() {
        return content;
    }
}
