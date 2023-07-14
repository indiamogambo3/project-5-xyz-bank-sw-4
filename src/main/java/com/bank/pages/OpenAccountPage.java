package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By searchCustomer = By.id("userSelect");
    By searchCurrency = By.id("currency");
    By processButton = By.xpath("//button[@type='submit']");


    public void searchCustomerCreatedInFirstTest(String customerName) {
        selectByVisibleTextFromDropDown(searchCustomer, customerName);
    }

    public void searchCurrencyPound(String currency) {
        selectByVisibleTextFromDropDown(searchCurrency, currency);
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }

    public String verifyAlertText() {
        return getTextFromAlert();
    }

    public void acceptTheAlert() {
        acceptAlert();
    }



}
