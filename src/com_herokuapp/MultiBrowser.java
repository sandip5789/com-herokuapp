package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Check on Multi Browser
 */

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        // 1 Setup Chrome browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        // 2 Open Url
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 3 Print the Title of the page
        System.out.println("Print the tile of the page : " + driver.getTitle());
        // 4 Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // 5 Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        // 6 Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("prime123@gmail.com");
        // 7 Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("prime123");
        // 8 Click on the Login Button
        driver.findElement(By.cssSelector(".fa")).click();
        // 9 Print the current Url
        System.out.println("The Current Url : " + driver.getCurrentUrl());
        // 10 Refresh the page
        driver.navigate().refresh();
        // 11 Close the browser
        driver.quit();
    }
}



