package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("7036241645");
        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("4ikmmy" + Keys.ENTER);
        // 5.Verify title changed to:
        // Expected: “Log into Facebook | Facebook”
        String expectedTitle =  "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Transfer Title verification PASSED");
        } else {
            System.out.println("Transfer Title verification FAILED");
        }


    }
}
