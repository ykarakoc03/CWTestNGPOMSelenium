package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoLoginPage {



    //init elemen methodu Page clas i  initialize etöek adına kullanilir
    public SauceDemoLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // @FindBy annotasyonu elementleri locate ederken kullandigimiz ve
    // initElements methodu ile elementlerin bulunmasini saglayan bir anotasyondur
    @FindBy(id="user-name")
    public WebElement txtUsername;

    @FindBy(id="password")
    public WebElement txtPassword;

    @FindBy(xpath ="//*[@id='login-button']" )
    public WebElement btnLogin;

@FindAll(
        {
                @FindBy(id="user-name"),
                @FindBy(id="password"),
                @FindBy(xpath ="//*[@id='login-button']")

        }
)
public List<WebElement> inputElement;


}
