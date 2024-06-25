package com.javatechie.querydsl;

import com.javatechie.querydsl.mock.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserService userServiceMock; // Mocked UserService

    @InjectMocks
    private UserService userService; // Instance of UserService for testing

    @Test
    public void testGetUserById() {
        // Mocking userServiceMock.getUserById(Long userId)
        when(userServiceMock.getUserById(anyLong())).thenReturn("Mocked User");

        String result = userService.getUserById(123L);
        assertEquals("Mocked User", result);

        // Verify that userServiceMock.getUserById was called with specific argument
        verify(userServiceMock).getUserById(123L);
    }

    @Test
    public void testSaveUser() {
        // Mocking userServiceMock.saveUser(String username)
        doNothing().when(userServiceMock).saveUser(anyString());

        userService.saveUser("testUser");

        // Verify that userServiceMock.saveUser was called with specific argument
        verify(userServiceMock).saveUser("testUser");
    }
}
