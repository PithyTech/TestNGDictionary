package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("After Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.print("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.print("After Test");
    }
}
