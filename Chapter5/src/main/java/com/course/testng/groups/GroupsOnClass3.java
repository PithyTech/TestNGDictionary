package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.print("GroupsOnClass3 运行 teacher1");
    }
    public void teacher2(){
        System.out.print("GroupsOnClass3 运行 teacher2");
    }

}
