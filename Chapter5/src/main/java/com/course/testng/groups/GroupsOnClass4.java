package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "class")
public class GroupsOnClass4 {

    public void class1(){
        System.out.print("GroupsOnClass4 运行 class1");
    }
    public void class2(){
        System.out.print("GroupsOnClass4 运行 class2");
    }

}
