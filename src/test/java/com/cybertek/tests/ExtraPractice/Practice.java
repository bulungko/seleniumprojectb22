package com.cybertek.tests.ExtraPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        // TC#5: Basic login authentication1-Open a chrome browser
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx3-Verify title equals:
        // Expected: Web Orders Login4-Enter username: Tester5-Enter password: test6-Click “Sign In” button
        // 7-Verify titleequals:Expected: Web Orders
        driver.get("");

        Thread.sleep(10000);
        //Can the user log in with a valid email id and password?
        //What happens when an invalid email id and valid password?
        //What happens when a valid email id and invalid password is entered?
        //What happens when an invalid email id and invalid password is entered?
        //What happens when the email id and password fields are left blank and the Login button is clicked?
        //Is the Forgot password? option working as expected?
        //Is every link on the page working as expected?

        1.Go to site https://qa3.vytrack.com/user/login  2.Enter Invalid User ID 3. Enter Password 4.Click submit

    }
}