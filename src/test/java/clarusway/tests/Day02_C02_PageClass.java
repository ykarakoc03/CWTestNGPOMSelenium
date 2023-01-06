package clarusway.tests;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.pages.SauceDemoHomePage;
import clarusway.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C02_PageClass {


    @Test
    public void pageClassTest() {

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage loginPage = new SauceDemoLoginPage();
        loginPage.txtUsername.sendKeys("standard_user");

       loginPage.txtPassword.sendKeys("secret_sauce");

        loginPage.btnLogin.click();

        //Burada homepage e gecis yaptigimizdan dolayi homepage classimizdan bir obje uretiriz

        SauceDemoHomePage homePage =new SauceDemoHomePage();
        Select select = new Select(homePage.filterDropdown);
        select.selectByValue("lohi");

        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("low to high"));


        Driver.closeDriver();



    }
}
