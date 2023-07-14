package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By customerCreatedName = By.id("userSelect");
    By loginButton = By.xpath("//button[@type='submit']");
    By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");




    public void searchCreatedCustomer(String customerName) {
        selectByVisibleTextFromDropDown(customerCreatedName, customerName);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyYourNameText() {
        return getTextFromElement(verifyYourName);
    }







}
