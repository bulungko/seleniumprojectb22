package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com");
       String expectedTitle = "Facebook - Log In or Sign Up";
       String actualTitle = driver.getTitle();
       if (expectedTitle.equals(actualTitle)) {
           System.out.println("Title verification Passed");
       } else {
           System.out.println("Title verification Failed");
       }
    }
}
