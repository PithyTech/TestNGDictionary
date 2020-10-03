package com.course.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "provider1")
    public void test1(String name, int age){
        System.out.print("name="+name+"; age="+age);
    }

    @DataProvider(name="provider1")
    public Object[][] provider1(){
        Object[][] o = new Object[][]{
                {"John", 35},
                {"CEO", 40},
                {"Boss", 45}
        };
        return o;
    }

    @Test(dataProvider = "provider2")
    public void test2(String name, int age){
        System.out.print("name="+name+"; age="+age);
    }
    @Test(dataProvider = "provider2")
    public void test3(String name, int age){
        System.out.print("name="+name+"; age="+age);
    }

    @DataProvider(name="provider2")
    public Object[][] provider2(Method method){
        Object[][] o = null;
        String name = method.getName();
        if(name.equals("test2")){
            o = new Object[][]{
                {"John1", 35},
                {"CEO1", 40},
                {"Boss1", 45}
            };
        }else if(name.equals("test3")){
            o = new Object[][]{
                    {"Big John", 35},
                    {"Big CEO", 40},
                    {"Big Boss", 45}
            };
        }
        return o;
    }


}
