package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest{
    @Test
    void test(){
        User user=new User();
        user.setEmail("hjson918@gmail.com");
        user.setName("son");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());


        User user1=new User(null,"martin","martin@fastcampus.com",LocalDateTime.now(),LocalDateTime.now());


        System.out.println(">>>"+user1);
    }

}