package com.lrb.qa.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConcept {

    public static void main(String[] args) {

        //Set property for chromedrver location
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        //Initialize for browser
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Time to wait for all elements to load
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Enter specified url
        driver.get("http://www.ebay.com");

        //Retrieve and print all the <a> elements
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement e : webElements) {
            System.out.println(e.getText());
        }
        System.out.println("\nTotal number of <a> elements: " + webElements.size());

        //Quit the browser
        driver.quit();
    }
}
