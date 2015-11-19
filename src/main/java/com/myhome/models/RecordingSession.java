package com.myhome.models;

import java.util.Date;

/**
 * Created by Asanga on 19/11/2015.
 */
public class RecordingSession {
    private String sessionId;
    private Date started;
    private Date stoppped;

    public RecordingSession(String sessionId) {
        this.sessionId = sessionId;
        this.started = new Date();
    }

    public RecordingSession(String sessionId, Date started) {
        this.sessionId = sessionId;
        this.started = started;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getStoppped() {
        return stoppped;
    }

    public void setStoppped(Date stoppped) {
        this.stoppped = stoppped;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
