package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_CybertekUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification Passed");
        } else {
            System.out.println("URL verification Failed");
        }

        String expectedInTitle = "cybertekschool";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");
        }


    }
}
