package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
    @BeforeClass
    void beforeclass(){
        System.out.println("This will run before every Test method");
    }
    @AfterClass
    void afterclass(){
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
        System.out.println("This will run test4");
    }
    @Test
    void test5(){
        System.out.println("This will run test4");
    }
    @Test
    void test6(){
        System.out.println("This will run test3");
    }

}
