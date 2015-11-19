package com.myhome.controllers;

import com.myhome.models.RecordingSession;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Asanga on 19/11/2015.
 */
@RestController
@RequestMapping("/recordingSession")
public class RecordingSessionController {

    @RequestMapping(method = RequestMethod.POST)
    public RecordingSession createSession() {
        return new RecordingSession(System.currentTimeMillis() + "_SID");
    }

    @RequestMapping(value = "/{sessionId}", method = RequestMethod.DELETE)
    public RecordingSession stopSession(@PathVariable("sessionId")String sessionId) {
        RecordingSession recordingSession = new RecordingSession(sessionId + "_SID");
        recordingSession.setStoppped(new Date());
        return recordingSession;
    }

    @RequestMapping(value = "/{sessionId}", method = RequestMethod.GET)
    public RecordingSession getSession(@PathVariable("sessionId") String sessionId) {
        return new RecordingSession(sessionId + "_SID");
    }

}
