package com.course.testng;

import org.testng.annotations.Test;

public class IgnorTest {

    @Test
    public void ignor1(){
        System.out.print("Ignor 1");
    }

    @Test(enabled = false)
    public void ignor2(){
        System.out.print("Ignor 2");
    }

    @Test(enabled = true)
    public void ignor3(){
        System.out.print("Ignor 3");
    }

}
