package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_CssSelector_AmazonTask {
    public static void main(String[] args) {

        //TC #3: Amazon link number verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Enter search term (use cssSelector to locate search box)
        WebElement searchBar = driver.findElement(By.cssSelector("input[id = 'twotabsearchtextbox']"));
        searchBar.sendKeys("wooden spoon" + Keys.ENTER);
        //4. Verify title EQUALS search term

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title varification PASSED");
        } else {
            System.out.println("Title varification FAILED");
        }



    }

}


