package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = {"stu"})
public class GroupsOnClass2 {

    public void stu1(){
        System.out.print("GroupsOnClass2 运行 stu1");
    }
    public void stu2(){
        System.out.print("GroupsOnClass2 运行 stu2");
    }

}
