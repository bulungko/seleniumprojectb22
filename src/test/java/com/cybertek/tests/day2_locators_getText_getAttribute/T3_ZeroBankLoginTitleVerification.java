package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_ZeroBankLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Enter username: username
        WebElement userLink = driver.findElement(By.id("user_login"));
        Thread.sleep(3000);
        userLink.sendKeys("username");
        // 4.Enter password: password
        Thread.sleep(3000);
        WebElement passwordLink = driver.findElement(By.name("user_password"));
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);
        // 5. Verify title changed to:Expected: “Zero –Account Summary”
        String expectedTitle = "Zero –Account Summary";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }


    }
}
