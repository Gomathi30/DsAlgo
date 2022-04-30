package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BaseClass{
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@href='queue']") 
	WebElement queueGetStarted;
	
	@FindBy (xpath="//a[@href='graph']") 
	WebElement graphGetStarted;
	
	public void clickonQueueGetStartedlnk() {
		queueGetStarted.click();
	}
	
	public void clickonGraphGetStartedlnk() {
		queueGetStarted.click();
	}
	
}
