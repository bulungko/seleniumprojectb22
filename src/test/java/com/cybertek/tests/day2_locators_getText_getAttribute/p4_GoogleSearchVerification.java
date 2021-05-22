package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_GoogleSearchVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        //        Expected: Title should start with “apple” word
        String acutalTitle = driver.getTitle();
        String expectedTitle = "apple";

        if(acutalTitle.startsWith(expectedTitle)) {
            System.out.println("Title starts with apple");

    }else {
            System.out.println("Title does not starts with apple");
        }
    }
}
