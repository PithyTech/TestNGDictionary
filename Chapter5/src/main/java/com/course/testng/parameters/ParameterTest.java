package com.course.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void simpParam(String name, int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
    }

}
