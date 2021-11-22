package com.luxoft.web;

import com.luxoft.web.page.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LuxTrainingTest {
    private static HomePage homePage;

    @BeforeAll
    static void init(){
        SetUp setUp = new SetUp();
        homePage = new HomePage(SetUp.driver);
    }

    @Test
    void verifySigninForms() {
//        HomePage homePage = new HomePage(SetUp.driver);
        homePage.clickLogo();
        homePage.clickLinkByText("Каталог");

    }

    @AfterAll
    static void tearDown(){
        SetUp.driver.quit();
    }
}
