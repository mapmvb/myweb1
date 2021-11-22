package com.luxoft.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SetUp {
    public static WebDriver driver;
    public static WebDriverWait waitVar;


    public SetUp() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setHeadless(false);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
        waitVar = new WebDriverWait(driver,5);
        driver.navigate().to("https://www.luxoft-training.ru/");
        driver.manage().window().maximize();
    }
}
