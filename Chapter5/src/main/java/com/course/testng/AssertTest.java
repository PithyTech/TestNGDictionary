package com.course.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class AssertTest {

    public void test1(){
        Assert.assertEquals(1, 2);
    }
    public void test2(){
        Assert.assertEquals(2, 2);
    }
    public void test3(){
        Assert.assertEquals("aaaa", "aaaa");
    }
    public void logDemo(){
        Reporter.log("这是我业务日志", 2);
        throw new RuntimeException("这是我自己抛出的业务异常信息");
    }

}
