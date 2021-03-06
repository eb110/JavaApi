package com.UnityTest;

import com.model.User;

import static org.junit.Assert.*;

public class UserTest {

    User temp = new User();

    @org.junit.Test
    public void getName() {
        temp.setName("Ola");
        assertEquals("Ola", temp.getName());
    }

    @org.junit.Test
    public void setName() {
        temp.setName("Ola");
        assertEquals("Ola", temp.getName());
    }

    @org.junit.Test
    public void setId(){
        temp.setId(1000);
        assertEquals(1000, temp.getId());
    }
}