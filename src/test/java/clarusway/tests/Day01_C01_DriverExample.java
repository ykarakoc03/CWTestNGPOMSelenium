package clarusway.tests;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C01_DriverExample {

    //https://opensource-demo.orangehrmlive.com/


    @Test
    public void test01() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title =Driver.getDriver().getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        WebDriver driver=Driver.getDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        String title =driver.getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();
    }
}
