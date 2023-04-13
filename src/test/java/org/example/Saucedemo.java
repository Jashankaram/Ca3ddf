package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Saucedemo {
    ChromeDriver driver;

    @BeforeClass
    void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1600, 860));
    }

    @Test
    void loginToSite() throws InterruptedException {
        driver.findElement(By.id("SIvCob")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("q")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("nsjnkjisjidjxijd");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Test
    void addToCart() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("inventory_item_price")).click();
        Thread.sleep(1000);
        WebElement cartLink = driver.findElement(By.className("shopping_cart_link"));
    }

    @AfterMethod
    void closeDriver() {
        driver.close();
    }
}
