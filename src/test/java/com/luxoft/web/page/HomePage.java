package com.luxoft.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Расписание")
//    List<WebElement> logo;
    WebElement logo1;

    public void clickLogo(){

//        logo.get(0).click();
        logo1.click();
    }

    public void clickLinkByText(String text) {
        driver.findElement(By.linkText(text)).click();
    }


}
// try