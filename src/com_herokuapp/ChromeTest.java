package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 * Created by Sandip Patel
 */
public class ChromeTest {
    public static void main(String[] args) {
        // 1 Setup Chrome browser
        String baseUrl = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();
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
