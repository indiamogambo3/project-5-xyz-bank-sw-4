package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logoutTab = By.xpath("//button[@class='btn logout']");
    By depositTab = By.xpath("//button[contains(text(),'Deposit')]");
    By amount = By.xpath("//input[@type='number']");
    By depositButton = By.xpath("//button[@type='submit']");
    By verifyDepositSuccessful = By.xpath("//span[@class='error ng-binding']");
    By withdrawal = By.xpath("//button[contains(text(),'Withdrawl')]");
    By withdrawButton = By.xpath("//button[@type='submit']");
    By transactionSuccessful = By.xpath("//span[@class='error ng-binding']");

    public String verifyLogoutTabDisplayed() {
        return getTextFromElement(logoutTab);
    }

    public void clickOnLogout() {
        clickOnElement(logoutTab);
    }

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void enterAmount(String enterAmount) {
        sendTextToElement(amount, enterAmount);
    }

    public void clickOnDepositButton() {
        clickOnElement(depositButton);
    }

    public String verifyDepositSuccessfulMessage() {
        return getTextFromElement(verifyDepositSuccessful);
    }

    public void clickOnWithdrawalTab() {
        clickOnElement(withdrawal);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String verifyTransactionSuccessfulMessage() {
        return getTextFromElement(transactionSuccessful);
    }

}
