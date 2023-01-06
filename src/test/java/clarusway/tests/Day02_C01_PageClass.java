package clarusway.tests;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Day02_C01_PageClass {


    @Test
    public void test01() {
        Driver.getDriver().get("https://www.saucedemo.com/");

        WebElement username = Driver.getDriver().findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        Driver.getDriver().findElement(By.id("login-button")).click();

        //        - Choose price low to high.
        Select dropdown= new Select(Driver.getDriver().findElement(By.tagName("select")));
        dropdown.selectByValue("lohi");

        //        - Verify item prices are sorted from low to high with hard Assert.
        List<WebElement> itemPrices = Driver.getDriver().findElements(By.className("inventory_item_price"));

        List<Double> urunFiyatlari = itemPrices.stream()
                .map(x -> x.getText().substring(1))
                .map(x -> Double.parseDouble(x))
                .collect(Collectors.toList());

        for (int i = 0; i < urunFiyatlari.size()-1; i++) {

            Assert.assertTrue(urunFiyatlari.get(i) <= urunFiyatlari.get(i+1));
        }

        Driver.closeDriver();



    }
}
