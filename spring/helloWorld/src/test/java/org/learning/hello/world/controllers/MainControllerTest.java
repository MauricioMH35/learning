package org.learning.hello.world.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.learning.hello.world.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.*;

class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("When Successful Show Message")
    public void whenSuccessfulShowMessage() throws Exception {
        Message message = new Message("Hello World!");

        assertEquals("Hello World!", message.getMessage());

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].message", is("Hello World!")));
    }

    @Test
    @DisplayName("When Not Found Message")
    public void whenNotFoundMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("When Bad Request")
    public void whenBadRequest() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isBadRequest());
    }
}