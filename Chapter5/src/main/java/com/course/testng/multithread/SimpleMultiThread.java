package com.course.testng.multithread;

import org.testng.annotations.Test;

public class SimpleMultiThread {

    static final int nThreads = Runtime.getRuntime().availableProcessors();
    static {
        System.out.printf("This computer has %s CPU cores%n", nThreads);
    }

    @Test(invocationCount = 10, threadPoolSize = 8)
    public void test1(){
        System.out.printf("SimpleMultiThread: Thread name: %s%n", Thread.currentThread().getId());
    }

}
