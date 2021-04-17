package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    //测试套件之前需要运行的方法，共有的
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
