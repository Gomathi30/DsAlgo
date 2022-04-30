package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass{
 
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@name='username']")
	WebElement username;
	@FindBy (xpath="//input[@name='password1']")
	WebElement password;
	@FindBy (xpath ="//input[@name='password2']")
	WebElement confirmPassword;
	@FindBy (xpath = "//input[@value='Register']")
	WebElement register ;
	
	
	public void Register() {
		username.clear();
		username.sendKeys("gomathi");
		
		password.clear();
		password.sendKeys("NumpyNinja");
		
		confirmPassword.clear();
		confirmPassword.sendKeys("NumpyNinja");
			
		
	}

	public void clickOnRegister() {
		
		register.click();
	}

}
