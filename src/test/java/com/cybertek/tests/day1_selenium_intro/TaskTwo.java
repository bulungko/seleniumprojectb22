package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC #2: Cybertekpractice toolverifications1.Open Chrome browser
// 2.Go to https://practice.cybertekschool.com3.Verify URL containsExpected: cybertekschool
// 4.Verify title: Expected: Practice
public class TaskTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practice.cybertekschool.com");
        String urlExpected ="cybertekschool";
        if (driver.getCurrentUrl().contains(urlExpected)) {
            System.out.println("Current url is verified as expected");
        } else {
            System.out.println("Current url is verified but unexpected");
        }
        if (driver.getTitle().equals("Practice")) {
            System.out.println("Title is verified as expected");
        } else {
            System.out.println("Title is verified but unexpected");
        }
    }
}
