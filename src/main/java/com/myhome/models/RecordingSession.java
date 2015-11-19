package com.myhome.models;

/**
 * Created by Asanga on 19/11/2015.
 */
public class RecordingSession {
    private String sessionId;

    public RecordingSession(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
