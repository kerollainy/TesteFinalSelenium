package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceOptionPage {

    public static WebElement selectSeguro (WebDriver browser) {
        return browser.findElement(By.cssSelector("#selectultimate"));
    }

    public static WebElement buttonNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextsendquote"));
    }
    
}
