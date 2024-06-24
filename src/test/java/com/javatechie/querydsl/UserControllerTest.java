//package com.javatechie.querydsl;
//
//import com.example.demo.service.UserService;
//import com.example.demo.controller.UserController;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.mockito.Mockito.verify;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(UserController.class) // Specify the controller class you want to test
//@AutoConfigureMockMvc
//public class UserControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private UserService userServiceMock;
//
//    @InjectMocks
//    private UserController userController;
//
//    @Test
//    public void testGetUser() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/user/123"))
//                .andExpect(status().isOk());
//
//        // Verify that userService.getUserById(Long userId) was called
//        verify(userServiceMock).getUserById(123L);
//    }
//
//    @Test
//    public void testSaveUser() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("/user")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("testUser"))
//                .andExpect(status().isOk());
//
//        // Verify that userService.saveUser(String username) was called
//        verify(userServiceMock).saveUser("testUser");
//    }
//}
