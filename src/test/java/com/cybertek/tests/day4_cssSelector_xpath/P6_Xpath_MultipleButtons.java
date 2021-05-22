package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_Xpath_MultipleButtons {
    public static void main(String[] args) {
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //3. Click on Button 1                              //button['.=Button 1']
        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick = 'button1()']"));
        buttonOne.click();
        //4. Verify text displayed is as expected:
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = resultText.getText();
        String expectedText = "Clicked on button one!";
        //Expected: “Clicked on button one!”
        if (actualText.equals(expectedText)) {
            System.out.println("Result text verification PASSED");
        } else {
            System.out.println("Result text verification FAILED");
        }
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }
}
