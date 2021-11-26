package com.bridgelabz.appium.pages;

import com.bridgelabz.appium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class Registration extends Base {
    public static void register() throws MalformedURLException {
        Base base = new Base();
        base.setUp();
        WebElement signUp = driver.findElement(By.id("com.example.fundo:id/textViewSignUp"));
        signUp.click();
        
        WebElement userName = driver.findElement(By.id("com.example.fundo:id/inputUserName"));
        userName.click();
        userName.sendKeys("karan");

        WebElement email = driver.findElement(By.id("com.example.fundo:id/inputEmail"));
        email.click();
        email.sendKeys("karan@gmail.com");

        WebElement password = driver.findElement(By.id("com.example.fundo:id/userPassword"));
        password.click();
        password.sendKeys("karansmith45");

        WebElement confirmPassword = driver.findElement(By.id("com.example.fundo:id/confirmPassword"));
        confirmPassword.click();
        password.sendKeys("karansmith45");

        WebElement button = driver.findElement(By.id("com.example.fundo:id/buttonRegister"));
        button.click();
        System.out.println("Registration is successfull");
    }
}
