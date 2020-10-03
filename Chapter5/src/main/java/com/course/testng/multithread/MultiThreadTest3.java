package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadTest3 {

    @Test
    public void test1(){
        System.out.printf("MultiThreadTest3 -> test1: Thread name: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("MultiThreadTest3 -> test2: Thread name: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("MultiThreadTest3 -> test3: Thread name: %s%n", Thread.currentThread().getId());
    }

}
