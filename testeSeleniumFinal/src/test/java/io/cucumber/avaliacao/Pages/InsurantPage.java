package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.avaliacao.Servicos.Configuracao;

public class InsurantPage extends Configuracao{
    
    public static WebElement inputFirstName (WebDriver browser) {
        return browser.findElement(By.cssSelector("#firstname"));
    }

    public static WebElement inputLastName (WebDriver browser) {
        return browser.findElement(By.cssSelector("#lastname"));
    }

    public static WebElement dataBirth (WebDriver browser) {
        return browser.findElement(By.cssSelector("#birthdate"));
    }

    public static WebElement inputGender (WebDriver browser) {
        return browser.findElement(By.cssSelector("#gendermale"));
    }

    public static WebElement inputAddress (WebDriver browser) {
        return browser.findElement(By.cssSelector("#streetaddress"));
    }

    public static WebElement selectCountry (WebDriver browser) {
        return browser.findElement(By.cssSelector("#country option:nth-child(32)"));
    }

    public static WebElement inputZipecode (WebDriver browser) {
        return browser.findElement(By.cssSelector("#zipcode"));
    }

    public static WebElement inputCity (WebDriver browser) {
        return browser.findElement(By.cssSelector("#city"));
    }

    public static WebElement selectOccupation (WebDriver browser) {
        return browser.findElement(By.cssSelector("#occupation option:nth-child(5)"));
    }

    public static WebElement inputHobbies (WebDriver browser) {
        return browser.findElement(By.cssSelector("#speeding"));
    }

    public static WebElement inputWebsite (WebDriver browser) {
        return browser.findElement(By.cssSelector("#website"));
    } 

    public static WebElement buttonNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextenterproductdata"));
    }
    
}
