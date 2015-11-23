package com.myhome.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * Created by Asanga Manage on 20/11/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class RecordingSessionControllerTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new RecordingSessionController()).build();
    }

    @Test
    public void creatRecordingSession() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/recordingSession").accept(MediaType.APPLICATION_JSON)).andExpect(content().string(containsString("sessionId")));
    }

    @Test
    public void getRecordingSession() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/recordingSession/{sessionId}", 123456).accept(MediaType.APPLICATION_JSON)).andExpect(content().string(containsString("\"sessionId\":\"123456_SID\"")));
    }

    @Test
    public void stopRecordingSession() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/recordingSession/{sessionId}", 123456).accept(MediaType.APPLICATION_JSON)).andExpect(content().string(containsString("\"sessionId\":\"123456_SID\"")));
    }
}
