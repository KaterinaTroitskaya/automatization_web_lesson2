package org.automatization.web.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void runAutorization (String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.aqua-shop.ru/");

        //region Test_1
        WebElement authorization = driver.findElement(By.cssSelector(".header-shop-region__link ._account"));
        authorization.click();

        WebElement emailInputField = driver.findElement(By.name("email_address"));
        emailInputField.click();
        emailInputField.sendKeys("javat28388@hhmel.com");

        WebElement passwordInputField = driver.findElement(By.name("password"));
        passwordInputField.click();
        passwordInputField.sendKeys("QWERTY");

        WebElement loginButton = driver.findElement(By.cssSelector(".login-button"));
        loginButton.click();

        WebElement loginOut = driver.findElement(By.cssSelector(".logout>a"));
        loginOut.click();
        //endregion



        //Thread.sleep(10000l);
        // driver.quit();


    }
}
