package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_ZeroBankLoginTitleVerification2 {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");
        // 4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);
        // 5.Click to “Account Activity” link
        driver.findElement(By.linkText("Account Activity")).click();
        // 6.Verify title changed to:Expected: “Zero –Account Activity”
        String expectedTitle = "Zero –Account Activity";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Account Title verification PASSED");
        } else {
            System.out.println("Account Title verification FAILED");
        }
        // 7.Click to “Transfer Funds” link
        driver.findElement(By.linkText("Transfer Funds")).click();
        // 8.Verify title changed to:Expected: “Zero –Transfer Funds”
        String expectedTransferTitle = "Zero –Transfer Activity";
        String actualTransferTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Transfer Title verification PASSED");
        } else {
            System.out.println("Transfer Title verification FAILED");
        }
        // 9.Click to “Pay Bills” link
        // 10.Verify title changed to:Expected: “Zero -Pay Bills”
        // 11.Click to “My Money Map” link
        // 12.Verify title changed to:Expected: “Zero –My Money Map”
        // 13.Click to “Online Statements” link
        // 14.Verify title changed to:Expected: “Zero –Online Statements”
    }
}
