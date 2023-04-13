package org.example;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    void beforesuite(){
        System.out.println("This will run before every Test");
    }
    @AfterSuite
    void aftersuite(){
        System.out.println("This will run before every Test method");
    }
    @BeforeTest
    void beforetest(){
        System.out.println("This will run after every method");
    }
    @Test
    void test1(){
        System.out.println("This will run test1");
    }
    @Test
    void test2(){
        System.out.println("This will run test2");
    }
    @Test
    void test3(){
        System.out.println("This will run test3");
    }
    @Test
    void test4(){
        System.out.println("This will run test3");
    }
    @Test
    void test5(){
        System.out.println("This will run test3");
    }
    @Test
    void test6(){
        System.out.println("This will run test3");
    }

}

