package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountTab = By.xpath("//button[contains(text(),'Open Account')]");


    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
    }



}
