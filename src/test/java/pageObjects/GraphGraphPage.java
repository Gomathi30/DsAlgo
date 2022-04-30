package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphGraphPage extends BaseClass {
public GraphGraphPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	@FindBy (linkText="Graph") 
	WebElement graphlnk;

	@FindBy (linkText="Graph Representations") 
	WebElement graphreplnk;
	
	@FindBy (linkText="Practice Questions")
	WebElement  practicequeslnk;
	@FindBy (linkText="Try here>>>")
	WebElement  tryherelnk;

	public void clickOnGraph()  {
		System.out.println("before clicking graph"+ graphlnk.isEnabled());
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		graphlnk.click();
	}
	public void clickOnGraphRep() {
		graphreplnk.click();
	}
	public void clickOnPracticeQuestion() {
		practicequeslnk.click();
	}
	public void clickOnTryHere() {
		tryherelnk.click();
	}
}
