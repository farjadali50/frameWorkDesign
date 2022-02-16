package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webLocatores.LoginPageElement;



public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver =driver;

    }

    private By FullName = By.xpath(LoginPageElement.fullName);
    private By Email = By.xpath(LoginPageElement.email);
    private  By PhoneNumber = By.xpath(LoginPageElement.phoneNumber);

    public void fullName(String fullName){

        driver.findElement(FullName).sendKeys(fullName);

    }

    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
    }

    public void phoneNumber(String phoneNumber){

        driver.findElement(PhoneNumber).sendKeys(phoneNumber);
    }

}
