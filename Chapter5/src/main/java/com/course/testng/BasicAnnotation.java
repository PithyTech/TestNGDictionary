package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.print("Test case 1");
    }

    @Test
    public void testCase2(){
        System.out.print("Test case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.print("Before method to run");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.print("After the method to run");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.print("Before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.print("After class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("Before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("After suite");
    }
}
