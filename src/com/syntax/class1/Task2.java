package com.syntax.class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2 {
    //Task 1: Executing different test based TestNG annotations
    //Create class that will have:
    //Before and After Class annotation
    //Before and After Method annotation
    //2 methods with Test annotation

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @Test
    public void test(){
        System.out.println("Test1");

    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
}
