package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.avaliacao.Servicos.Configuracao;

public class SendQuotePage extends Configuracao {

    public static WebElement inputEmail (WebDriver browser) {
        return browser.findElement(By.cssSelector("#email"));
    }
    
    public static WebElement inputPhone (WebDriver browser) {
        return browser.findElement(By.cssSelector("#phone"));
    }

    public static WebElement inputUsername (WebDriver browser) {
        return browser.findElement(By.cssSelector("#username"));
    }

    public static WebElement inputPassword (WebDriver browser) {
        return browser.findElement(By.cssSelector("#password"));
    }

    public static WebElement inputConfirmPassword (WebDriver browser) {
        return browser.findElement(By.cssSelector("#confirmpassword"));
    } 

    public static WebElement buttonSend (WebDriver browser) {
        return browser.findElement(By.cssSelector("#sendemail"));
    }

    public static WebElement menssagemSucesso (WebDriver browser) {
        return browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2"));
    } 

    public static WebElement buttonOk (WebDriver browser) {
        return browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button"));
    }

    
}
