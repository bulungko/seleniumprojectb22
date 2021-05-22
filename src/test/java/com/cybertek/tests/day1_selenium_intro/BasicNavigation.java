package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of selenium web driver
        //this line opens a browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //only work for mac
        driver.manage().window().fullscreen();

        //3-get the page for tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("Current title: "+ driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        //putting 3 sec of wait/stop the code for 3sec
        Thread.sleep(1000);

        //Going back using navigation
        driver.navigate().back();
        Thread.sleep(1000);

        //going forward using navigation
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.navigate().refresh();

        //going to another url using to() method
        driver.navigate().to("https://www.google.com");
        //driver.get("https://www.google.com");
        // ->wait until the page is loaded before going to next step
        System.out.println("current title: "+ driver.getTitle());
       currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab
        driver.close();
        //driver.quit();



    }
}
