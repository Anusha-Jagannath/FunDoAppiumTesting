package com.bridgelabz.appium.pages;

import com.bridgelabz.appium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class Login extends Base {
    public static void login() throws MalformedURLException {
        Base base = new Base();
        base.setUp();
        WebElement email = driver.findElement(By.id("com.example.fundo:id/emailID"));
        email.click();
        email.sendKeys("anusha@gmail.com");
        WebElement password = driver.findElement(By.id("com.example.fundo:id/inputPassword"));
        password.click();
        password.sendKeys("12345678");
        WebElement button = driver.findElement(By.id("com.example.fundo:id/buttonLogin"));
        button.click();
        System.out.println("Login is successfull");
    }
}
