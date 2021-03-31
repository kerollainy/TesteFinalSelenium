package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.avaliacao.Servicos.Configuracao;

public class ProductPage extends Configuracao{

    public static WebElement inputCalendar (WebDriver browser) {
        return browser.findElement(By.cssSelector("#startdate"));
    }

    public static WebElement inputInsurance (WebDriver browser) {
        return browser.findElement(By.cssSelector("#insurancesum option:nth-child(5)"));
    }

    public static WebElement inputMerit (WebDriver browser) {
        return browser.findElement(By.cssSelector("#meritrating option:nth-child(5)"));
    }

    public static WebElement inputDamage (WebDriver browser) {
        return browser.findElement(By.cssSelector("#damageinsurance option:nth-child(2)"));
    } 

    public static WebElement inputOptional (WebDriver browser) {
        return browser.findElement(By.cssSelector("#EuroProtection"));
    }

    public static WebElement inputCourtesy (WebDriver browser) {
        return browser.findElement(By.cssSelector("#courtesycar option:nth-child(2)"));
    }

    public static WebElement buttonNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextselectpriceoption"));
    }
    
}
