package org.automatization.web.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CheckWorkingHoursTest {
    public static void runCheckWorkingHours() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.aqua-shop.ru/");

        WebElement workingHours = driver.findElement(By.cssSelector(".header-shop-region__work-time>a"));
        workingHours.click();

    }
}
