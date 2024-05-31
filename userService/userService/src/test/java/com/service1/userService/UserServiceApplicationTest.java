package com.service1.userService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service1.userService.controller.UserController;

@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
public class UserServiceApplicationTest {

    @Autowired
    private MockMvc mockMvc;

//    @Mock
//    private UserService userService;

    @Autowired
    private UserController userController;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetUserById() throws Exception {
      
        // Perform GET request to "/1" and verify the response
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:9093/user/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.userId").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.userName").value("User1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.userAddr").value("Address1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[0].conId").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[0].email").value("email1@example.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[0].phone").value("1234567890"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[0].userId").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[1].conId").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[1].email").value("email2@example.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[1].phone").value("0987654321"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[1].userId").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[2].conId").value(3))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[2].email").value("email3@example.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[2].phone").value("9876543210"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[2].userId").value(1));
    }


}

