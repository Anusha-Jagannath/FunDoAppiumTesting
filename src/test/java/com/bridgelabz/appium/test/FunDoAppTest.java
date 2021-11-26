package com.bridgelabz.appium.test;

import com.bridgelabz.appium.base.Base;
import com.bridgelabz.appium.pages.Login;
import com.bridgelabz.appium.pages.Registration;

import java.net.MalformedURLException;

public class FunDoAppTest extends Base {
    public static void main(String[] args) throws MalformedURLException {
        Login.login();
        Registration.register();
    }
}
