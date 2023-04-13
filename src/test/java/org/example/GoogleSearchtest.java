package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test


public class GoogleSearchtest {


    public void GoogleTest(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys( "Mobile");
        driver.findElement(By.name("btnK")).click();
        driver.close();
    }



}

