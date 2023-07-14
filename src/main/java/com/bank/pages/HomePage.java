package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    By homeTab = By.xpath("//button[@class='btn home']");



    public void clickOnBankManagerLoginTab() {
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
    }

    public void clickOnHomeTab() {
        clickOnElement(homeTab);
    }



}
