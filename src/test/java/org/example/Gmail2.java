package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmail2 {
    FirefoxDriver driver;

    @BeforeClass
    void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AQMjQ7TlJ2YigjJCoka1kM_heGEyEijrRAKCznttOZzfx8unxGOYFKvqKWwqoOIzBHxitulSMGMQDw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();

    }

    @Test
    void loginToSite() throws InterruptedException {
        driver.findElement(By.id("identifierId")).click();
        driver.findElement(By.id("identifierId")).sendKeys("jashankaramnsr@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']//div[@class='VfPpkd-RLmnJb']")).click();
        Thread.sleep(10000);
        driver.findElement(By.className("hiddenPassword")).sendKeys("Jashan#007");
        Thread.sleep(2000);
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();



    }


    @AfterMethod
    void closeDriver() {
        driver.close();
    }
}