package com.course.testng;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionTest {

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    public void exception1() throws Exception{
        System.out.print("exception1");
        throw new IOException();
    }

}
