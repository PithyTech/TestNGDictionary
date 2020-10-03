package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.print("server test1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.print("server test2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.print("client test1");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.print("client test2");
    }

    @BeforeGroups("server")
    public void beforeServerGroups() {
        System.out.print("Before server groups");
    }

    @AfterGroups("server")
    public void afterServerGroups() {
        System.out.print("After server groups");
    }

    @BeforeGroups("client")
    public void beforeClientGroups() {
        System.out.print("Before client groups");
    }

    @AfterGroups("client")
    public void afterClientGroups() {
        System.out.print("After client groups");
    }
}
