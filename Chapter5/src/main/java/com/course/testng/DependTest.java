package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void login(){
        System.out.print("login");
    }

    @Test(dependsOnMethods = {"login","addToCart"})
    public void buy(){
        System.out.print("buy");
    }

    @Test(dependsOnMethods = {"login"})
    public void addToCart(){
        System.out.print("addToCart");
    }

}
