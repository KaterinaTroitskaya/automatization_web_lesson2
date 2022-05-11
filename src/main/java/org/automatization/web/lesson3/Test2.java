package org.automatization.web.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {
    public static void runCheckPhoneNumber(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        WebElement contacts = driver.findElement(By.cssSelector(".second-menu-wrap > ul > li:nth-child(10) > a"));
        contacts.click();
        WebElement phoneText = driver.findElement(By.cssSelector("contacts-shops-tel"));
        String phoneNumber = phoneText.getText();
        String realPhoneNumber = ("Наш единый телефон: +7 (499) 745-00-44");
        if (phoneNumber.equals(realPhoneNumber)){
            System.out.println("номер телефона верный");
        } else {
            System.out.println("ошибка в номере телефона");
        }


    }
}
