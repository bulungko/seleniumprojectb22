package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement inputUserName = driver.findElement(By.id("email"));
        inputUserName.sendKeys("bulungmo@gmail.com");
        // 4.Enter incorrect password
        WebElement inputUserPass = driver.findElement(By.id("pass"));
        inputUserPass.sendKeys("12345" + Keys.ENTER);
        // 5.Verify title changed to:

        // Expected: “Log into Facebook”
        String expectedTitle = "Log into Facebook";
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Transfer Title verification PASSED");
        } else {
            System.out.println("Transfer Title verification FAILED");
        }
    }
}
