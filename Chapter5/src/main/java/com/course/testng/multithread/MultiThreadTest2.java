package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadTest2 {

    @Test
    public void test1(){
        System.out.printf("MultiThreadTest2 -> test1: Thread name: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("MultiThreadTest2 -> test2: Thread name: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("MultiThreadTest2 -> test3: Thread name: %s%n", Thread.currentThread().getId());
    }


}
