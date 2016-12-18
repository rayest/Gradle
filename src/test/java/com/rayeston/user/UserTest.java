package com.rayeston.user;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/12/18 0018.
 */
public class UserTest {
    @Test
    public void testAddUser() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("rayest");
        assertEquals(1, user.getId());
        assertEquals("rayest", user.getName());
    }
}
