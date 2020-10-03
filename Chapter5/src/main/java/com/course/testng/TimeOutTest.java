package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)
    public void test1() throws Exception{
        Thread.sleep(2000);
    }
    @Test(timeOut = 3000)
    public void test2() throws Exception{
        Thread.sleep(4000);
    }

}
