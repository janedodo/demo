package com.service.demo123.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDemo123 {

        Demo123Delegate demo123Delegate = new Demo123Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = demo123Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}