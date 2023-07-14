package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {

        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Mukesh");
        addCustomerPage.enterLastName("Shah");
        addCustomerPage.enterPostCode("LN1 1LN");
        addCustomerPage.clickOnAddCustomerButton();
        String expectedPopupDisplayText = "Customer added successfully with customer id :6";
        Assert.assertEquals(addCustomerPage.verifyAlertText(), expectedPopupDisplayText, "Unable to verify text.");
        addCustomerPage.acceptingAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {

//        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        Thread.sleep(2000);
        openAccountPage.searchCustomerCreatedInFirstTest("Mukesh Shah");
        openAccountPage.searchCurrencyPound("Pound");
        openAccountPage.clickOnProcessButton();
        String expectedAccountCreatedMessage = "Account created successfully with account Number :1016";
        Assert.assertEquals(openAccountPage.verifyAlertText(), expectedAccountCreatedMessage, "Unable to verify text.");
        openAccountPage.acceptTheAlert();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {


        homePage.clickOnHomeTab();
        homePage.clickOnCustomerLoginTab();
        customersPage.searchCreatedCustomer("Mukesh Shah");
        customersPage.clickOnLoginButton();
        String expectedLogoutText = "Logout";
        Assert.assertEquals(accountPage.verifyLogoutTabDisplayed(), expectedLogoutText, "Unable to verify text.");
        accountPage.clickOnLogout();
        String expectedYourNameText = "Your Name :";
        Assert.assertEquals(customersPage.verifyYourNameText(), expectedYourNameText, "Unable to verify text.");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {

        homePage.clickOnHomeTab();
        homePage.clickOnCustomerLoginTab();
        customersPage.searchCreatedCustomer("Mukesh Shah");
        customersPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount("100");
        accountPage.clickOnDepositButton();
        String expectedDepositSuccessfulMessage = "Deposit Successful";
        Assert.assertEquals(accountPage.verifyDepositSuccessfulMessage(), expectedDepositSuccessfulMessage, "Unable to verify message.");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

        homePage.clickOnHomeTab();
        homePage.clickOnCustomerLoginTab();
        customersPage.searchCreatedCustomer("Mukesh Shah");
        customersPage.clickOnLoginButton();
        accountPage.clickOnWithdrawalTab();
        accountPage.enterAmount("50");
        accountPage.clickOnWithdrawButton();
        String expectedTransactionSuccessfulMessage = "Transaction successful";
        Assert.assertEquals(accountPage.verifyTransactionSuccessfulMessage(), expectedTransactionSuccessfulMessage, "Unable to verify message.");

    }

}
