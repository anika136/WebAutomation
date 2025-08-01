package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest extends DriverSetup{
    @Test
    public void testGooglePageTitle() {
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.google.com");
        String pageTitle = browser.getTitle();
        Assert.assertEquals(pageTitle, "Google");

    }
    @Test
    public void testGooglePageURL(){
        WebDriver browser = new ChromeDriver();
      browser.get("https://www.google.com");
        String pageUrl = browser.getCurrentUrl();

        // Validate title with text "Google"
        Assert.assertEquals(pageUrl, "https://www.google.com/");
    }
}
